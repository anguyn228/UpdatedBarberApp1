package com.example.barbercornerproj.model;

public class RatingModel {
    private String barberId;
    private String userId;

    public String getBarberId() {
        return barberId;
    }

    public RatingModel(String barberId, String userId, int ratingId, float rating, String comment) {
        this.barberId = barberId;
        this.userId = userId;
        this.ratingId = ratingId;
        this.rating = rating;
        this.comment = comment;
    }

    public void setBarberId(String barberId) {
        this.barberId = barberId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    private int ratingId;
    private float rating;
    private String comment;

}
