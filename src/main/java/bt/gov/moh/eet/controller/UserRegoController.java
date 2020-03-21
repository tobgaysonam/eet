package bt.gov.moh.eet.controller;

import bt.gov.moh.eet.service.UserRegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ICT-MoF on 3/20/2020.
 */@Controller
   @RequestMapping("/userRegistration")
public class UserRegoController {
    @Autowired
    private UserRegoService userRegoService;
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index(ModelMap model) {
       model.addAttribute("getGates", userRegoService.getGate());
        model.addAttribute("getUserType", userRegoService.getUserType());
        return "eet/userRegistration";
    }
}
