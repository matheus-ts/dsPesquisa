package com.dspesquisa.repositories;

import com.dspesquisa.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Games, Long> {

}
