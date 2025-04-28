package com.example.api.repository;

import com.example.api.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
} 