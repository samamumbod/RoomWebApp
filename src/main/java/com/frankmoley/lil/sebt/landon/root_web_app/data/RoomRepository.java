package com.frankmoley.lil.sebt.landon.root_web_app.data;

import com.frankmoley.lil.sebt.landon.root_web_app.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
