package com.dspesquisa.controllers;

import com.dspesquisa.dto.GameDTO;
import com.dspesquisa.dto.RecordDTO;
import com.dspesquisa.dto.RecordInsertDTO;
import com.dspesquisa.services.GamesService;
import com.dspesquisa.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping(value="/records")
public class RecordsController {

    @Autowired
    private RecordService service;

    @PostMapping
    public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto){
        RecordDTO nDto = new RecordDTO();
        nDto = service.insert(dto);
        return ResponseEntity.ok().body(nDto);
    }

    @GetMapping
    public ResponseEntity<Page<RecordDTO>> findAll(
            @RequestParam(value= "min",defaultValue = "") String min,
            @RequestParam(value="max", defaultValue = "") String max,
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage", defaultValue = "0") Integer linesPerPage,
            @RequestParam(value = "orderBy", defaultValue = "moment") String orderBy,
            @RequestParam(value = "direction", defaultValue = "DESC") String direction){

        Instant minDate = ("".equals(min)) ? null : Instant.parse(min);

        Instant maxDate = ("".equals(max)) ? null : Instant.parse(max);

        if(linesPerPage == 0 ){
            linesPerPage = Integer.MAX_VALUE;
        }

        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction),orderBy);


        Page<RecordDTO> list = service.findByMoments( minDate,maxDate,pageRequest);
        return ResponseEntity.ok().body(list);
    }



}
