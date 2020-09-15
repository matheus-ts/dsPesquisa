package com.dspesquisa.services;

import com.dspesquisa.dto.GameDTO;
import com.dspesquisa.entities.Games;
import com.dspesquisa.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GamesService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameDTO> findAll(){
        List<Games> list= repository.findAll();
        return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList()); //Função lambda para converter o tipo Games em uma Lista de games DTO
    }
}
