package com.crdcs.workbench.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @Author: zxm
 * @Date: 2019/11/27 17:27
 *
 * 提供给各模块做启用停用的通用类
 */
@Controller
public class Index {
    @GetMapping(value = { "/**/*.htm", "/**/*.html","/" })
    public String index(HttpServletRequest request, HttpServletResponse response){
        return "index";
    }
}
