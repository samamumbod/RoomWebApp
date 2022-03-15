package com.frankmoley.lil.sebt.landon.root_web_app.controllers;

import com.frankmoley.lil.sebt.landon.root_web_app.models.StaffMember;
import com.frankmoley.lil.sebt.landon.root_web_app.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/staff")
public class StaffRestController {

    private final StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffMember> getStaffMembers(){
        return staffService.getAllStaff();
    }

}
