package com.dspesquisa.repositories;

import com.dspesquisa.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository //Ou @ component
public interface GameRepository extends JpaRepository<Games, Long> {

}
