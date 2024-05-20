package com.example.sailassignment.http.response;

public record PostPostResponse(
    Long id,
    String username,
    String title,
    String content,
    Integer price
) {

}
