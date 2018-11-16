package com.xiaohuya.test.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){

        return "jsp/hello.jsp";

    }
}
