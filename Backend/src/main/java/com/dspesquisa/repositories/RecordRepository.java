package com.dspesquisa.repositories;

import com.dspesquisa.entities.Genre;
import com.dspesquisa.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
