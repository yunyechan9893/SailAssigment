package com.example.sailassignment.service;

import com.example.sailassignment.http.request.PostPostRequest;
import com.example.sailassignment.http.request.PutPostRequest;
import com.example.sailassignment.model.Item;
import com.example.sailassignment.repository.PostRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaleService {
    private final PostRepository postRepository;

    public List<Item> getGetPostResponse() {
        return postRepository.findAll();
    }
    public Item getPostPostResponse(PostPostRequest request) {
        return postRepository.save(Item.builder()
                .title(request.title())
                .content(request.content())
                .price(request.price())
                .username(request.username())
                .build());
    }
    public Item getPutPostResponse(Long postId, PutPostRequest request) {
        Optional<Item> item = postRepository.findById(postId);
        if (item.isEmpty()) {
            new Exception("해당 게시물이 없습니다");
        }

        Item updatedItem = item.get().update(
            request.title(),
            request.content(),
            request.price(),
            request.username());

        return postRepository.save(updatedItem);
    }
    public void getDeletePostResponse(Long postId) {
        postRepository.deleteById(postId);
    }
}
