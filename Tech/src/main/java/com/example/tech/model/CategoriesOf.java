package com.example.tech.model;

import jakarta.persistence.*;

@Entity
public class CategoriesOf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(50)")
    private String cateOfName;

    @ManyToOne
    @JoinColumn(name = "Categories_id")
    private Categories categories;

    public CategoriesOf() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCateOfName() {
        return cateOfName;
    }

    public void setCateOfName(String cateOfName) {
        this.cateOfName = cateOfName;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }
}
