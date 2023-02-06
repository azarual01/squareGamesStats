package com.squareGames.stats.DAO;

import org.springframework.stereotype.Component;

@Component
public class GameDao {
    GameRepository gameRepository;

    public GameDao(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }
}
