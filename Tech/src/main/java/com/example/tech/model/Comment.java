package com.example.tech.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long commentId;

    @Column(columnDefinition = "varchar(255)")
    private String content;

    private LocalDateTime commentDate;

    @ManyToOne
    @JoinColumn(name = "blog_id")
    private Blog blog;

    @ManyToOne
    @JoinColumn(name = "userInfor_id")
    private UserInfor userInfor;

    public Comment() {
    }

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public UserInfor getUserInfor() {
        return userInfor;
    }

    public void setUserInfor(UserInfor userInfor) {
        this.userInfor = userInfor;
    }
}
