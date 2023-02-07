package com.squareGames.stats.controllers;

import com.squareGames.stats.DAO.GameDao;
import com.squareGames.stats.DAO.UserDao;
import com.squareGames.stats.Dto.GameDTO;
import com.squareGames.stats.Dto.UserDtoWinsAndLoses;
import com.squareGames.stats.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Optional;

@RestController
public class StatsController {
    @Autowired
    UserDao userDao;
    @Autowired
    GameDao gameDao;
    @PostMapping("/games/game/stats")
    public ResponseEntity<Void> getGame(@RequestBody GameDTO gameDto, UriComponentsBuilder builder){
        HttpHeaders headers = new HttpHeaders();
        System.out.println("ee"+gameDto);
        // http://localhost:9092/games/game/stats
        // headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getArticleId()).toUri());
        userDao.getAll();
        User user = new User("email"+(userDao.getAll().size()+1)+"@gmail.com","firstName"+(userDao.getAll().size()+1),"lastName"+(userDao.getAll().size()+1));
        userDao.saveUser(user);
        GameDTO gameDTO = new GameDTO(gameDto.getId(),gameDto.getStatus(),gameDto.getFactoryId());
        gameDao.saveGame(gameDTO,user);
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }


    @GetMapping("/games/stats/{userId}")
    public UserDtoWinsAndLoses winsAndLosesOfuser(@PathVariable Integer userId){
        System.out.println(userId);
        Optional<User> user = userDao.findOne(userId);
        UserDtoWinsAndLoses userDtoWinsAndLoses = new UserDtoWinsAndLoses(user);
        return userDtoWinsAndLoses;
    }
}
