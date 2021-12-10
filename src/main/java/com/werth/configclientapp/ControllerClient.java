package com.werth.configclientapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerClient {

    @Value("${rate}")
    String rate;

    @Value("${lanecount}")
    String lanecount;

    @Value("${tollstart}")
    String tollstart;

    @GetMapping("/rate")
    public String getRate(Model m) {
        m.addAttribute("rate", rate);
        m.addAttribute("lanecount", lanecount);
        m.addAttribute("tollstart", tollstart);

        return "rateview";
    }


}
