package com.amir.userservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    private String id;
    private Integer userId;
    private Integer hotelId;
    private Integer rating;
    private String feedback;
    private Hotel hotel;
}
