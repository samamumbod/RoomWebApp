package com.frankmoley.lil.sebt.landon.root_web_app.data;

import com.frankmoley.lil.sebt.landon.root_web_app.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Enables communication with the database precisely the Employee table
 */
public interface StaffRepository extends JpaRepository<StaffMember,String> {
}
