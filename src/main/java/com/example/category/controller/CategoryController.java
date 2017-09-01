package com.example.category.controller;

import com.example.category.dto.CategoryDto;
import com.example.category.entity.Category;
import com.example.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by whilemouse on 17. 8. 31.
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET, value="/find")
    @Transactional
    public Category find(){
        String name = "category4";
        CategoryDto.Result result = categoryService.find(name);
        return null;
    }

}
