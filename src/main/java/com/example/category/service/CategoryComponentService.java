package com.example.category.service;

import com.example.category.dto.CategoryComponentDto;
import com.example.category.dto.CategoryCompositeDto;
import com.example.category.dto.CategoryLeafDto;
import com.example.category.entity.CategoryComponent;
import com.example.category.entity.CategoryComposite;
import com.example.category.entity.CategoryLeaf;
import com.example.category.repository.CategoryComponentRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.Provider;
import org.modelmapper.TypeMap;
import org.modelmapper.internal.asm.Type;
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

    private void getCategoryComponent(CategoryComponent categoryComponent) {
        if(categoryComponent instanceof CategoryComposite) {
            Class<CategoryComposite> type = CategoryComposite.class;
            CategoryComposite categoryComposite = type.cast(categoryComponent);
            CategoryCompositeDto.Result result = new CategoryCompositeDto.Result();
            result.setName(categoryComposite.getName());
            result.setId(categoryComposite.getId());
            /////////////////////////////
            /////////////////////////////
            /////////////////////////////
        } else if(categoryComponent instanceof CategoryLeaf) {
            Class<CategoryLeaf> type = CategoryLeaf.class;
            CategoryLeaf categoryLeaf = type.cast(categoryComponent);
            CategoryLeafDto.Result result = new CategoryLeafDto.Result();
            result.setName(categoryLeaf.getName());
            result.setId(categoryLeaf.getId());
        }
    }

}
