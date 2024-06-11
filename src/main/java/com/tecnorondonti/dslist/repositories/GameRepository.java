package com.tecnorondonti.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnorondonti.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
