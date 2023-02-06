package com.squareGames.stats.DAO;

import com.squareGames.stats.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Integer> {
}
