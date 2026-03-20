package com.capstone.jewelrytracker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "jewelry_items")
public class JewelryItem extends Product {

    @NotBlank(message = "Material is required.")
    @Column(nullable = false)
    private String material;

    public JewelryItem() {
        super();
    }

    public JewelryItem(String name, String category, Double price, Integer quantity, String material) {
        super(name, category, price, quantity);
        this.material = material;
    }

    @Override
    public String getProductType() {
        return "Jewelry Item";
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}