package com.example.sailassignment.http.request;

import lombok.Builder;

@Builder
public record PostPostRequest(
    String username,
    String title,
    String content,
    Integer price

) {

}
