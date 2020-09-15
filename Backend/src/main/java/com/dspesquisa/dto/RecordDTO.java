package com.dspesquisa.dto;

import com.dspesquisa.entities.Plataform;
import com.dspesquisa.entities.Record;

import java.io.Serializable;
import java.time.Instant;

public class RecordDTO implements Serializable {

    private static final long serialvLersionUID =1L;

    private Long id;
    private Instant moment;
    private String name;
    private Integer age;
    private String gameTitle;
    private Plataform gamePlatform;
    private String genreName;

    public RecordDTO(){}

    public RecordDTO(Record entity){
        id = entity.getId();
        moment= entity.getMoment();
        name= entity.getName();
        age = entity.getAge();
        gameTitle = entity.getGame().getTitle();
        gamePlatform = entity.getGame().getPlataform();
        genreName = entity.getGame().getGenre().getName();
    }
}
