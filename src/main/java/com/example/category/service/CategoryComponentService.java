package com.example.category.service;

import com.example.category.dto.CategoryComponentDto;
import com.example.category.entity.CategoryComponent;
import com.example.category.repository.CategoryComponentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by whilemouse on 17. 9. 1.
 */
@Service
public class CategoryComponentService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CategoryComponentRepository categoryComponentRepository;

    public CategoryComponentDto.Result find(String name) {
        CategoryComponent categoryComposite = categoryComponentRepository.find(name);
        CategoryComponentDto.Result result = modelMapper.map(categoryComposite, CategoryComponentDto.Result.class);
        return result;
    }

}
