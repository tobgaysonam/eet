package bt.gov.moh.eet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ICT-MoF on 3/20/2020.
 */@Controller
   @RequestMapping("/userrego")
public class UserRegoController {
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index() {
        return "ttpl/userregistration";
    }
}
