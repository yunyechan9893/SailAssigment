package com.example.sailassignment.http.request;

public record PutPostRequest(
    String title,
    String content,
    Integer price,
    String username
) {

}
