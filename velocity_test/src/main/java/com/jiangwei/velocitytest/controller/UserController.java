package com.jiangwei.velocitytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Franco on 2016/10/17.
 */

@Controller
public class UserController {

    @RequestMapping(value = "/showUser", method = RequestMethod.GET)
    public void showUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().print("<b>Hello MRS World!</b>");
        response.flushBuffer();
    }
}
