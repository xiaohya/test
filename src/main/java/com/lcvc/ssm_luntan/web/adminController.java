package com.lcvc.ssm_luntan.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class adminController {
    @RequestMapping(value = "/admin/hello", method = RequestMethod.GET)
    public String hello(){

        return "/ssm_luntan/hello.jsp";
    }
}
