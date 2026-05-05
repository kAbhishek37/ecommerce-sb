package com.personal.ecommerce.entity;

import jakarta.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;

    public Category() {
    }

    public Integer getId() {
        return id;
    }

    public Category(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
