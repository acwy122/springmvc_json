package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;


@Controller
public class DownController {

    @RequestMapping("/download")
    public String download(HttpServletRequest request){
        return "";
    }
}
