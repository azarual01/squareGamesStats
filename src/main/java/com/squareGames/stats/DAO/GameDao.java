package com.squareGames.stats.DAO;

import com.squareGames.stats.Dto.GameDTO;
import com.squareGames.stats.model.Game;
import com.squareGames.stats.model.User;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Component
public class GameDao {
    GameRepository gameRepository;

    public GameDao(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public void saveGame(GameDTO gameDTO, User user){
        Game game = new Game(gameDTO.getStatus(),gameDTO.getFactoryId(),gameDTO.getId().toString());
        game.addPlayer(user);
        gameRepository.save(game);
    }
//    public List<User> getAll(){
////        <S extends T> List<S> findAll(Example<S> example);
//        return gameRepository.findAll();
//    }
}
