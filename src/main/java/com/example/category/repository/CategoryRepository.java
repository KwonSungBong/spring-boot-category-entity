package com.example.category.repository;

import com.example.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created by whilemouse on 17. 8. 31.
 */
public interface CategoryRepository extends JpaRepository<Category, UUID> {
    Category findByName(String name);
}
