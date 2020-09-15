package com.dspesquisa.controllers;

import com.dspesquisa.dto.GameDTO;
import com.dspesquisa.entities.Games;
import com.dspesquisa.repositories.GameRepository;
import com.dspesquisa.services.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/games")
public class GamesController {

    @Autowired
    private GamesService service;

    @GetMapping()
    public ResponseEntity<List<GameDTO>> findAll(){
        List<GameDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
