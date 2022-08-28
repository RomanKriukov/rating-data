package com.kriukov.cursor.ratingdata.controller;

import com.kriukov.cursor.ratingdata.entity.Rating;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingInfoController {

    @GetMapping("/{movieId}")
    public ResponseEntity<Rating> getRatingForMovie(@PathVariable int movieId){
        return ResponseEntity.ok(new Rating(movieId, 4));
    }

    @GetMapping("/users/{userId}")
    public List<Rating> getUserRating(@PathVariable String userId){

        return List.of(new Rating(1234, 4), new Rating(5678, 5));
    }
}
