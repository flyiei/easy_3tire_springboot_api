package com.example.api.controller;

import com.example.api.model.Item;
import com.example.api.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/spring")
@CrossOrigin(origins = "*")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    // API 1: Get all items
    @GetMapping("/items")
    public ResponseEntity<List<Item>> getAllItems() {
        return ResponseEntity.ok(itemService.getAllItems());
    }

    // API 2: Create a new item
    @PostMapping("/items")
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        return new ResponseEntity<>(itemService.saveItem(item), HttpStatus.CREATED);
    }

    // API 3: Get server status
    @GetMapping("/status")
    public ResponseEntity<Map<String, String>> getStatus() {
        return ResponseEntity.ok(Map.of(
            "status", "UP",
            "service", "Spring Boot API",
            "version", "1.0.0"
        ));
    }
} 