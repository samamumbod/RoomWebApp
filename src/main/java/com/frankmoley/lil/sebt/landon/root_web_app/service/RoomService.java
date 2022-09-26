package com.frankmoley.lil.sebt.landon.root_web_app.service;

import com.frankmoley.lil.sebt.landon.root_web_app.data.RoomRepository;
import com.frankmoley.lil.sebt.landon.root_web_app.models.Room;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Extract data from the room repository
 */
@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
}
