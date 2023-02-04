package com.masai.main.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/request")
public class MyController {

    @GetMapping("/app/api/user/dashboard")
    public String userDashboard() {
        return "User Dashboard";
    }

    @GetMapping("/app/api/admin/dashboard")
    public String adminDashboard() {
        return "Admin Dashboard";
    }

    @PostMapping("/app/api/admin/new")
    public String createAdmin() {
        return "Creating admin";
    }

    @GetMapping("/app/api/user/{userid}")
    public String getUser(@PathVariable("userid") String userid) {
        return "getting user with ID: " + userid;
    }
}
