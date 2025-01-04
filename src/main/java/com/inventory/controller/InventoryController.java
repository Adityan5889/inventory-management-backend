package com.inventory.controller;

import com.inventory.model.InventoryItem;
import com.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService service;

    @GetMapping
    public List<InventoryItem> getAllItems() {
        return service.getAllItems();
    }

    @PostMapping
    public InventoryItem addItem(@RequestBody InventoryItem item) {
        return service.addItem(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable String id) {
        service.deleteItem(id);
    }
}
