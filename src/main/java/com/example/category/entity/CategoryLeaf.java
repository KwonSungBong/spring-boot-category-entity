package com.example.category.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by whilemouse on 17. 8. 31.
 */
@Entity
@DiscriminatorValue("LEFT")
@Data
@ToString(exclude = "parent")
public class CategoryLeaf extends CategoryComponent {

    @ManyToOne
    @JoinColumn(name="parent_id")
    private CategoryComponent parent;

    @Override
    public void setParent(CategoryComponent categoryComponent) {
        this.parent = categoryComponent;
    }
}
