package com.app.services.impl;

import com.app.models.Room;
import com.app.repositories.RoomsRepository;
import com.app.services.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomsServiceImpl implements RoomsService {
    @Autowired
    private RoomsRepository roomRepository;
    @Override
    public List<Room> getAll() {
        return this.roomRepository.findAll();
    }

    @Override
    public List<Room> SearchByType(String type) {
        return this.SearchByType(type);
    }
}
