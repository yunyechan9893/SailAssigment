package com.example.sailassignment.http.dto;

public record PostListDto(
    Long id,
    String username,
    String title,
    String content,
    Integer price
) {

}
