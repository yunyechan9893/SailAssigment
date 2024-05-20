package com.example.sailassignment.controller;

import com.example.sailassignment.http.dto.SuccessResponse;
import com.example.sailassignment.http.request.PostPostRequest;
import com.example.sailassignment.http.request.PutPostRequest;
import com.example.sailassignment.model.Item;
import com.example.sailassignment.service.SaleService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class SaleController {

    private final SaleService saleService;

    @GetMapping
    public ResponseEntity<List<Item>> getPostResponse() {
        List<Item> getPostResponse = saleService.getGetPostResponse();
        return ResponseEntity.ok().body(getPostResponse);
    }

    @PostMapping
    public ResponseEntity<Item> postPostResponse(
        @RequestBody
        PostPostRequest request
    ) {
        Item item = saleService.getPostPostResponse(request);
        return ResponseEntity.ok().body(item);
    }


    @PutMapping("/{postId}")
    public ResponseEntity<Item> putPostResponse(
        @PathVariable("postId")
        Long postId,
        @RequestBody
        PutPostRequest request
    ) {
        Item item = saleService.getPutPostResponse(postId, request);
        return ResponseEntity.ok().body(item);
    }

    @DeleteMapping("/{postId}")
    public ResponseEntity<SuccessResponse> deletePostResponse(
        @PathVariable
        Long postId
    ) {
        saleService.getDeletePostResponse(postId);

        return ResponseEntity.ok().body(
            new SuccessResponse("삭제 완료"));
    }
}
