package com.example.sailassignment.http.response;

public record PutPostResponse(
    Long id,
    String title,
    String content,
    Integer price,
    String username
) {

}
