package com.example.sailassignment.http.response;

import com.example.sailassignment.model.Item;
import java.util.List;
import lombok.Builder;

@Builder
public record GetPostResponse(
    List<Item> itemList
) {

}
