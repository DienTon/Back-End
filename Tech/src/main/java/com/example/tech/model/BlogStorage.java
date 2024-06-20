package com.example.tech.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class BlogStorage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long storageId;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "userinfor_id")
    private UserInfor userInfor;

    @ManyToOne
    @JoinColumn(name = "blog_id")
    private Blog blog;

    public BlogStorage() {
    }

    public long getStorageId() {
        return storageId;
    }

    public void setStorageId(long storageId) {
        this.storageId = storageId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public UserInfor getUserInfor() {
        return userInfor;
    }

    public void setUserInfor(UserInfor userInfor) {
        this.userInfor = userInfor;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
