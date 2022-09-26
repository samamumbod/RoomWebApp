package com.frankmoley.lil.sebt.landon.root_web_app.controllers;

import com.frankmoley.lil.sebt.landon.root_web_app.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for the staff page
 */
@Controller
@RequestMapping("staff")
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public String getAllStaffs(Model model){
        model.addAttribute("staff", staffService.getAllStaff());
        return "staff";
    }
}
