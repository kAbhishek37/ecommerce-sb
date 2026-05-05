package com.personal.ecommerce.service;

import com.personal.ecommerce.controller.CategoryController;
import com.personal.ecommerce.dto.CategoryDto;
import com.personal.ecommerce.entity.Category;
import com.personal.ecommerce.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    public void saveCategory(CategoryDto categoryDto) {
        Category category=new Category(categoryDto.getName());
        categoryRepo.save(category);
    }

    public void deleteCategory(Integer id) {
        categoryRepo.deleteById(id);
    }

    public List<Category> getAllCategory() {
        return categoryRepo.findAll();
    }

    public Category getCategory(Integer id) {
        Optional<Category> category= categoryRepo.findById(id);
        return category.orElse(null);
    }
}
