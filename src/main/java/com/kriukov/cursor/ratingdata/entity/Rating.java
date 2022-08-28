package com.kriukov.cursor.ratingdata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rating {

    private int movieId;

    private int rating;
}
