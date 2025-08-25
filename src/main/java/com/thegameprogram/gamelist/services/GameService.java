package com.thegameprogram.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thegameprogram.gamelist.dto.GameMinDTO;
import com.thegameprogram.gamelist.entities.Game;
import com.thegameprogram.gamelist.repositories.GameRepository;


@Service
public class GameService{

    @Autowired
    private GameRepository gameRepository; 

    public List<Game> findAll() {
        List<Game> result = gameRepository.findAll();
        return result; 
    }
}
