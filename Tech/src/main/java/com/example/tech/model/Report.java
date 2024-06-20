package com.example.tech.model;

import jakarta.persistence.*;

@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportId;

    @Column(columnDefinition = "varchar(150)", nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "userinfor_id")
    private UserInfor userInfor;

    @ManyToOne
    @JoinColumn(name = "blog_id")
    private Blog blog;

    public Report() {
    }

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
