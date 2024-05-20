package com.example.sailassignment.repository;

import com.example.sailassignment.model.Item;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Item, Long> {
    List<Item> findAll();

}
