package com.example.category.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Arrays;
import java.util.List;

/**
 * Created by whilemouse on 17. 8. 31.
 */
@Entity
@DiscriminatorValue("COMPOSITE")
@Data
@ToString(exclude = "children")
public class CategoryComposite extends CategoryComponent {

    @OneToMany(mappedBy = "parent")
    private List<Category> children = Arrays.asList();

    @Override
    public void setParent(CategoryComponent categoryComponent) {
    }
}
