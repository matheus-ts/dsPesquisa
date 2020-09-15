package com.dspesquisa.controllers;

import com.dspesquisa.dto.GameDTO;
import com.dspesquisa.dto.RecordDTO;
import com.dspesquisa.dto.RecordInsertDTO;
import com.dspesquisa.services.GamesService;
import com.dspesquisa.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/records")
public class RecordsController {

    @Autowired
    private RecordService service;

    @PostMapping
    public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto){
        RecordDTO nDto = service.insert(dto);
        return ResponseEntity.ok().body(nDto);
    }

}
