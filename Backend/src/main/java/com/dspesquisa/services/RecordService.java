package com.dspesquisa.services;

import com.dspesquisa.dto.GameDTO;
import com.dspesquisa.dto.RecordDTO;
import com.dspesquisa.dto.RecordInsertDTO;
import com.dspesquisa.entities.Games;
import com.dspesquisa.entities.Record;
import com.dspesquisa.repositories.GameRepository;
import com.dspesquisa.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecordService {

    @Autowired
    private RecordRepository repository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public RecordDTO insert (RecordInsertDTO dto){
        Record entity = new Record();
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setMoment(Instant.now());

        Games game = gameRepository.getOne(dto.getGameId());
        entity.setGame(game);

        entity = repository.save(entity);

        return new RecordDTO(entity);
    }
}
