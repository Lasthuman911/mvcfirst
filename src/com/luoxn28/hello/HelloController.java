package com.luoxn28.hello;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Name: admin
 * Date: 2017/4/16
 * Time: 21:11
 */
public class HelloController extends AbstractController{

    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response){
        String hello = request.getParameter("hello");

        System.out.println("HelloController:"+ hello);
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("hello",hello);
        return mav;
    }
}
