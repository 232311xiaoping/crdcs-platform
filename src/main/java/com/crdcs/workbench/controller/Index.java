package com.crdcs.workbench.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Index {
    @RequestMapping(value = { "/**/*.htm", "/**/*.html","/" })
    public String index(HttpServletRequest request, HttpServletResponse response){
        return "index";
    }
}
