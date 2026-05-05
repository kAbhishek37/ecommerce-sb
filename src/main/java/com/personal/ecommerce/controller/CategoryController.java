package com.personal.ecommerce.controller;

import com.personal.ecommerce.dto.CategoryDto;
import com.personal.ecommerce.entity.Category;
import com.personal.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cat")
@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/save")
    public String saveCategory(@RequestBody CategoryDto categoryDto)
    {
        categoryService.saveCategory(categoryDto);
        return "Saved successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCategory(@PathVariable Integer id)
    {
        categoryService.deleteCategory(id);
        return "Deleted successfully";
    }

    @GetMapping("get/{id}")
    public Category getCategory(@PathVariable Integer id)
    {
        return categoryService.getCategory(id);
    }

    @GetMapping("getall")
    public List<Category> getAllCategory()
    {
        return categoryService.getAllCategory();
    }
}
