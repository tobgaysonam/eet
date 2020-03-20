package bt.gov.moh.eet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by nzepa on 3/6/2020.
 */
@Controller
@RequestMapping("/calculator")
public class CalculatorController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index() {
        return "ttpl/calculator";
    }
}
