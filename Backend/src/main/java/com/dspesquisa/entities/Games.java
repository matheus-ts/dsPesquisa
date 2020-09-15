package com.dspesquisa.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Games implements Serializable {

    private static final long serialvLersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Plataform platform;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;


    @OneToMany(mappedBy = "game")
    private List<Record> records = new ArrayList<>();

    public Games(Long id, String title, Plataform platform, Genre genre) {
        this.id = id;
        this.title = title;
        this.platform = platform;
        this.genre = genre;
    }

    public List<Record> getRecords() {
        return records;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Games)) return false;
        Games games = (Games) o;
        return Objects.equals(getId(), games.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters
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

    public Plataform getPlataform() {
        return platform;
    }

    public void setPlataform(Plataform plataform) {
        this.platform = plataform;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
