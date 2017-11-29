package com.smart.controller;

import com.smart.domain.User;
import com.smart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test")
public class MyController {

    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public String selectAllUser(Model model) {
//        System.out.println("the springmvc success!");
        List<User> users = userService.queryAllUser();
        model.addAttribute("users", users);
        return "test/success";
    }
}
