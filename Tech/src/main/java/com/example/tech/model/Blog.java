package com.example.tech.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long blogId;

    @Column(columnDefinition = "varchar(50)", nullable = false)
    private String title;

    @Column(columnDefinition = "LONGTEXT", nullable = false)
    private String content;

    @Column(columnDefinition = "LONGTEXT")
    private String img;

    private Integer likes;

    private Integer views;

    @Column(columnDefinition = "DateTime")
    private LocalDateTime dateBegin;

    @ColumnDefault("0")
    @JoinColumn(columnDefinition = "BIT")
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "Categories_id")
    private Categories categories;

    public Blog() {
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public LocalDateTime getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(LocalDateTime dateBegin) {
        this.dateBegin = dateBegin;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }
}
