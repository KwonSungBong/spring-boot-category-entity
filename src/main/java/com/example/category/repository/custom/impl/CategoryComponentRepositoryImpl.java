package com.example.category.repository.custom.impl;

import com.example.category.entity.CategoryComponent;
import com.example.category.entity.CategoryComposite;
import com.example.category.repository.custom.CustomCategoryComponentRepository;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

/**
 * Created by whilemouse on 17. 8. 31.
 */
public class CategoryComponentRepositoryImpl extends QueryDslRepositorySupport implements CustomCategoryComponentRepository {

    public CategoryComponentRepositoryImpl() {
        super(CategoryComponent.class);
    }

    @Override
    public CategoryComposite find() {
        return null;
    }
}
