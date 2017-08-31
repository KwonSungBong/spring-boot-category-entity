package com.example.category.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by whilemouse on 17. 8. 31.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TYPE")
@Data
@ToString(exclude = {"parent", "children"})
public abstract class CategoryComponent {

    @Id
    @GeneratedValue(generator="UUID")
    @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String name;

    @ManyToOne
    @JoinColumn(name="PARENT_ID")
    private CategoryComponent parent;

    @OneToMany(mappedBy = "parent")
    private List<CategoryComponent> children = Arrays.asList();

}