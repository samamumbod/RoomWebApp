package com.frankmoley.lil.sebt.landon.root_web_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for authentication
 * linked to the login page
 */
@Controller
public class AuthenticatonController {

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }
}
