package com.crdcs.workbench.controller;

import io.netty.handler.codec.http.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class Index {
    @RequestMapping(value = { "/**/*.htm", "/**/*.html","/" })
    public String index(HttpServletRequest request, HttpServletResponse response){
        return "index";
    }
}
