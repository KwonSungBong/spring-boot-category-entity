package com.example.category.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(callSuper=false)
public class CategoryLeaf extends CategoryComponent {
}
