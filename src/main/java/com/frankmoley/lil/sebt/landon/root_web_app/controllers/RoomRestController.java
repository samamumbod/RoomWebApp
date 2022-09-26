package com.frankmoley.lil.sebt.landon.root_web_app.controllers;


import com.frankmoley.lil.sebt.landon.root_web_app.models.Room;
import com.frankmoley.lil.sebt.landon.root_web_app.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Rest API that Reads all rooms
 */
@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {

    private final RoomService roomService;

    public RoomRestController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<Room> getRooms(){
        return roomService.getAllRooms();
    }
}
