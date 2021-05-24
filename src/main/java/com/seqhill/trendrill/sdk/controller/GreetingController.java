package com.seqhill.trendrill.sdk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author kevin
 */
@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public @ResponseBody
    String greeting() {
        return "Hello World";
    }
}
