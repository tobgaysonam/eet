package bt.gov.moh.eet.controller;

/**
 * Created by ICT-MoF on 3/20/2020.
 */

import bt.gov.moh.eet.dto.GuestLogDTO;
import bt.gov.moh.eet.service.CommonServiceApi;
import bt.gov.moh.eet.service.GuestLogService;
import bt.gov.moh.helper.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;

@Controller
  @RequestMapping("/guestLog")
public class GuestLogController {
    @Autowired
    private GuestLogService guestLogService;
    ResponseMessage responseMessage;
    @Autowired
    private CommonServiceApi commonServiceApi;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index(ModelMap model) {
        model.addAttribute("IdentificationType", guestLogService.getIdentificationType());
        model.addAttribute("getExitReasons", guestLogService.getExitReasons());
        model.addAttribute("getNationalities", guestLogService.getNationalities());
        return "eet/guestRegistration";
    }
    @ResponseBody
    @RequestMapping(value = "/getCitizenDetails", method = RequestMethod.GET)
    public ResponseMessage getCitizenDetails(String cidNo) {
        responseMessage = commonServiceApi.getCitizenDetails(cidNo);
        return responseMessage;
    }

    @ResponseBody
    @RequestMapping(value = "/saveGuestLog", method = RequestMethod.POST)
    public ResponseMessage saveGuestLog(HttpServletRequest request, HttpServletResponse response,GuestLogDTO guestLogDTO) throws Exception {
        responseMessage = guestLogService.saveGuestLog(request,guestLogDTO);
        return responseMessage;
    }

}
