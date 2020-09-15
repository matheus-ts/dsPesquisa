package com.dspesquisa.repositories;

import com.dspesquisa.entities.Games;
import com.dspesquisa.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
