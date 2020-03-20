package bt.gov.moh.eet.service;

import bt.gov.moh.helper.ResponseMessage;
import bt.gov.moh.eet.dao.StudentDetailDao;
import bt.gov.moh.eet.dto.StudentDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nzepa on 3/7/2020.
 */
@Service
public class StudentDetailService {
    @Autowired
    private StudentDetailDao studentDetailDao;
    
    public ResponseMessage getStudentDetail(String cid) {
        ResponseMessage responseMessage = new ResponseMessage();
        StudentDetailDTO studentDetailDTO = studentDetailDao.getStudentDetail(cid);

        if (studentDetailDTO != null) {
            responseMessage.setResponseDTO(studentDetailDTO);
            responseMessage.setResponseStatus(1);
        } else {
            responseMessage.setResponseStatus(0);
            responseMessage.setResponseText("No result found matching " + cid + " .Please " +
                    "search with different CID");
        }
        return responseMessage;
    }

    public ResponseMessage getStudentList() {
        ResponseMessage responseMessage = new ResponseMessage();
        List<StudentDetailDTO> studentDetailDTOs = studentDetailDao.getStudentList();
        if (studentDetailDTOs != null) {
            responseMessage.setResponseDTO(studentDetailDTOs);
            responseMessage.setResponseStatus(1);
        } else {
            responseMessage.setResponseStatus(0);
            responseMessage.setResponseText("No result found matching ");
        }
        return responseMessage;
    }

    public ResponseMessage getTopThreeStudentList() {
        ResponseMessage responseMessage = new ResponseMessage();
        List<StudentDetailDTO> studentDetailDTOs = studentDetailDao.getTopThreeStudentList();
        if (studentDetailDTOs != null) {
            responseMessage.setResponseDTO(studentDetailDTOs);
            responseMessage.setResponseStatus(1);
        } else {
            responseMessage.setResponseStatus(0);
            responseMessage.setResponseText("No result found matching ");
        }
        return responseMessage;
    }

    public ResponseMessage getAvgMarksRatioList() {
        ResponseMessage responseMessage = new ResponseMessage();
        StudentDetailDTO studentDetailDTO = studentDetailDao.getAvgMarksRatioList();

        if (studentDetailDTO != null) {
            responseMessage.setResponseDTO(studentDetailDTO);
            responseMessage.setResponseStatus(1);
        } else {
            responseMessage.setResponseStatus(0);
            responseMessage.setResponseText("No result found matching" );
        }
        return responseMessage;
    }
}
