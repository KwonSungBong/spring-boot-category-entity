package com.example.category.controller;

import com.example.category.entity.CategoryComponent;
import com.example.category.repository.CategoryComponentRepository;
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
    private CategoryComponentRepository categoryComponentRepository;

    @RequestMapping(method = RequestMethod.GET, value="/find")
    @Transactional
    public CategoryComponent find(){
        String name1 = "categoryComposite1";
        String name2 = "categoryLeaf1";
        CategoryComponent categoryComposite1 = categoryComponentRepository.findByName(name1);
        CategoryComponent categoryLeaf1 = categoryComponentRepository.findByName(name2);
        return null;
    }

}
