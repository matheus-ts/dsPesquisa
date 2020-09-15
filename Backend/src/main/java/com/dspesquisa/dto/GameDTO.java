package com.dspesquisa.dto;

import com.dspesquisa.entities.Games;
import com.dspesquisa.entities.Plataform;

import java.io.Serializable;

public class GameDTO implements Serializable {

    private static final long serialvLersionUID =1L;
    private Long id;
    private  String title;
    private Plataform platform;

    public GameDTO(Games entity){
        id= entity.getId();
        title = entity.getTitle();
        platform= entity.getPlataform();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Plataform getPlatform() {
        return platform;
    }

    public void setPlatform(Plataform platform) {
        this.platform = platform;
    }
}
