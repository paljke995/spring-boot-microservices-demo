package com.example.ratingsdataservice.model;

import com.example.ratingsdataservice.model.Rating;

import java.util.Arrays;
import java.util.List;


public class UserRating {

    private String  userId;
    private List<Rating> ratings;

    private List<Rating> userRating;

    public List<Rating> getUserRating() {
        return userRating;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    public void initData(String userId){
        this.setUserId(userId);
        this.setRatings(Arrays.asList(
                new Rating("550", 3)
        ));
    }

}
