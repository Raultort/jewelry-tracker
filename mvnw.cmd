package com.capstone.jewelrytracker.repository;

import com.capstone.jewelrytracker.model.JewelryItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<JewelryItem, Long> {
    List<JewelryItem> findByNameContainingIgnoreCase(String name);
    List<JewelryItem> findByCategoryContainingIgnoreCase(String category);
}