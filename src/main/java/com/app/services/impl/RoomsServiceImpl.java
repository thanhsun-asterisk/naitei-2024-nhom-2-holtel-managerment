package com.app.services.impl;

import com.app.models.Room;
import com.app.repositories.RoomRepository;
import com.app.services.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomsServiceImpl implements RoomsService {
    @Autowired
    private RoomRepository roomRepository;
    @Override
    public List<Room> getAll() {
        return roomRepository.findAll();
    }

    @Override
    public List<Room> SearchByString(String keyword) {
        return roomRepository.findByNameContainingIgnoreCase(keyword);
    }
}
