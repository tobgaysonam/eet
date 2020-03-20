package bt.gov.moh.eet.controller;

/**
 * Created by ICT-MoF on 3/20/2020.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
  @RequestMapping("/dentry")
public class EetController {
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index() {
        return "ttpl/eetregistration";
    }
}
