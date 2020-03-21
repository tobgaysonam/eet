package bt.gov.moh.eet.service;

import bt.gov.moh.eet.dao.GuestLogDao;
import bt.gov.moh.eet.dto.GuestLogDTO;
import bt.gov.moh.eet.entity.GuestLogDetail;
import bt.gov.moh.enumeration.SystemDataInt;
import bt.gov.moh.helper.DropdownDTO;
import bt.gov.moh.helper.ResponseMessage;
import org.exolab.castor.types.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * Created by ICT-MoF on 3/20/2020.
 */
@Service
public class GuestLogService {
    @Autowired
    private GuestLogDao guestLogDao;
    ResponseMessage responseMessage;

    public List<DropdownDTO> getIdentificationType() {
        return guestLogDao.getIdentificationType();
    }
    public List<DropdownDTO> getExitReasons() {
        return guestLogDao.getExitReasons();
    }
    public List<DropdownDTO> getNationalities() {
        return guestLogDao.getNationalities();
    }


    public ResponseMessage saveGuestLog(HttpServletRequest request, GuestLogDTO guestLogDTO) {
        GuestLogDetail guestLogDetail = convertApplicantDTOtoEntity(guestLogDTO);
        guestLogDao.saveGuestLog(guestLogDetail);
        responseMessage.setResponseStatus(SystemDataInt.MESSAGE_STATUS_SUCCESSFUL.value());
        responseMessage.setResponseText("Submitted successfully.");
        return responseMessage;
    }

    private GuestLogDetail convertApplicantDTOtoEntity(GuestLogDTO guestLogDTO) {
        GuestLogDetail guestLogDetail = new GuestLogDetail();
        guestLogDetail.setGender(guestLogDTO.getGender());
        guestLogDetail.setAge(guestLogDTO.getAge());
        guestLogDetail.setContact_no(guestLogDTO.getContactNo());
        guestLogDetail.setEntry_date_time(new Date());
        guestLogDetail.setExit_date_time(new Date());
        guestLogDetail.setCreated_on(new Date());
        guestLogDetail.setCreated_by(guestLogDTO.getCreated_by());
        guestLogDetail.setGuest_name(guestLogDTO.getName());
        guestLogDetail.setIdentification_no(guestLogDTO.getIdentificationNo());
        guestLogDetail.setIdentification_type_id(guestLogDTO.getIdentificationTypeId());
        guestLogDetail.setNationality_id(guestLogDTO.getNationalityId());
        guestLogDetail.setPresent_address(guestLogDTO.getPresentAddress());
        guestLogDetail.setReason_id(guestLogDTO.getExitReasonId());
        guestLogDetail.setTemperature(guestLogDTO.getTemperature());
        guestLogDetail.setReason(guestLogDTO.getReasons());
        guestLogDetail.setGateId(guestLogDTO.getGateId());
        guestLogDetail.setAlertFlag(guestLogDTO.getAlertFlag());
        guestLogDetail.setAlertUpdateTime(new Date());
        return guestLogDetail;
    }

    public ResponseMessage fetchExistingGuestLogDetails(String cidNo) {
        ResponseMessage responseMessage = new ResponseMessage();
        GuestLogDTO guestLogDTO = guestLogDao.fetchExistingGuestLogDetails(cidNo);
        if (guestLogDTO != null) {
            responseMessage.setResponseStatus(SystemDataInt.MESSAGE_STATUS_SUCCESSFUL.value());
            responseMessage.setResponseDTO(guestLogDTO);
        }
        return responseMessage;
    }
}
