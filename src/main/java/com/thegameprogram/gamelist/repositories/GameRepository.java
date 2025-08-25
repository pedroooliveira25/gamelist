package com.thegameprogram.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thegameprogram.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
