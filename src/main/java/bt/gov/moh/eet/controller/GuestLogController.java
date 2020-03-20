package bt.gov.moh.eet.controller;

/**
 * Created by ICT-MoF on 3/20/2020.
 */

import bt.gov.moh.eet.service.GuestLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
  @RequestMapping("/guestLog")
public class GuestLogController {
    @Autowired
    private GuestLogService guestLogService;
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index(ModelMap model) {
        model.addAttribute("IdentificationType", guestLogService.getIdentificationType());
        model.addAttribute("getExitReasons", guestLogService.getExitReasons());
        model.addAttribute("getNationalities", guestLogService.getNationalities());
        return "eet/guestRegistration";
    }


}
