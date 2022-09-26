package com.frankmoley.lil.sebt.landon.root_web_app.service;

import com.frankmoley.lil.sebt.landon.root_web_app.data.StaffRepository;
import com.frankmoley.lil.sebt.landon.root_web_app.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Extract data from the staff repository
 */
@Service
public class StaffService {

    private StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }
}
