package com.personal.ecommerce.entity;

import jakarta.persistence.*;

@Entity
public class Category {
    @Id
    private Integer id;
    private String name;

}
