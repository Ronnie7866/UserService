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
    private Integer id;
    private Integer userId;
    private Integer hotelId;
    private Integer rating;
    private String feedback;
}
