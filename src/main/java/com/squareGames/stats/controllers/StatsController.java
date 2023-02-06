package com.squareGames.stats.controllers;

import com.squareGames.stats.Dto.GameDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class StatsController {

    @PostMapping("/games/game/stats")
    public ResponseEntity<Void> getGame(@RequestBody GameDto gameDto, UriComponentsBuilder builder){
        HttpHeaders headers = new HttpHeaders();
        System.out.println("ee"+gameDto);
        // http://localhost:9092/games/game/stats
        // headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getArticleId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
}
