package bt.gov.moh.eet.service;

import bt.gov.moh.eet.dto.CitizenDetailDTO;
import bt.gov.moh.enumeration.SystemDataInt;
import bt.gov.moh.helper.ResponseMessage;
import com.squareup.okhttp.OkHttpClient;
import org.apache.xmlbeans.impl.tool.CodeGenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.DCRC_CitizenDetailsAPI.DefaultApi;
import org.wso2.client.model.DCRC_CitizenDetailsAPI.CitizenDetailsResponse;
import org.wso2.client.model.DCRC_CitizenDetailsAPI.CitizendetailsObj;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;

/**
 * Created by Sonam Tobgay on 3/21/2020.
 */
@Service
public class CommonServiceApi {
    public ResponseMessage getCitizenDetails(String cidNo) { ResponseMessage responseMessage = new ResponseMessage();

            CitizenDetailDTO citizenDetailDTO = new CitizenDetailDTO();

        try {
            OkHttpClient httpClient = new OkHttpClient();
            httpClient.setConnectTimeout(10000, TimeUnit.MILLISECONDS);
            httpClient.setReadTimeout(10000, TimeUnit.MILLISECONDS);

            ApiClient apiClient = new ApiClient();
            apiClient.setHttpClient(httpClient);

            apiClient.setBasePath("https://staging-datahub-apim.dit.gov.bt/dcrc_citizen_details_api/1.0.0");
            apiClient.setAccessToken("1c57772f-1829-3576-b9f0-d722083fb65c");

            DefaultApi api = new DefaultApi(apiClient);

            CitizenDetailsResponse citizenDetailsResponse = api.citizendetailsCidGet(String.valueOf(cidNo));

            if (citizenDetailsResponse.getCitizenDetailsResponse().getCitizenDetail() != null &&
                    !citizenDetailsResponse.getCitizenDetailsResponse().getCitizenDetail().isEmpty()) {
                CitizendetailsObj citizendetailsObj = citizenDetailsResponse.getCitizenDetailsResponse().getCitizenDetail().get(0);

                citizenDetailDTO.setName(citizendetailsObj.getFirstName() + " " + citizendetailsObj.getMiddleName() + citizendetailsObj.getLastName());
                citizenDetailDTO.setName(citizenDetailDTO.getName().replaceAll("null", ""));
                System.out.println("Gender " + citizendetailsObj.getGender());
                citizenDetailDTO.setGender(citizendetailsObj.getGender());
                citizenDetailDTO.setAge(citizendetailsObj.getDob());
            }
        } catch (Exception e) {
            responseMessage.setResponseStatus(SystemDataInt.MESSAGE_STATUS_UNSUCCESSFUL.value());
            responseMessage.setResponseText("No information found matching CID No " + cidNo);
            return responseMessage;
        }

        responseMessage.setResponseDTO(citizenDetailDTO);
        responseMessage.setResponseStatus(SystemDataInt.MESSAGE_STATUS_SUCCESSFUL.value());
        return responseMessage;
    }
}
