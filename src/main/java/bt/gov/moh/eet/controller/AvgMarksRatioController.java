package bt.gov.moh.eet.controller;

import bt.gov.moh.helper.ResponseMessage;
import bt.gov.moh.eet.service.StudentDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by nzepa on 3/7/2020.
 */
@Controller
@RequestMapping("/avgMarksRatio")
public class AvgMarksRatioController {
    @Autowired
    StudentDetailService studentDetailService;
    ResponseMessage responseMessage;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index() {
        return "ttpl/avgMarksRatio";
    }

    @ResponseBody
    @RequestMapping(value = "/getAvgMarksRatioList", method = RequestMethod.GET)
    public ResponseMessage getStudentDetail() throws Exception {
        responseMessage = studentDetailService.getAvgMarksRatioList();
        return responseMessage;
    }
}
