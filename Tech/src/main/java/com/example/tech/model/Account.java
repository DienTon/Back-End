package com.example.tech.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @Column(columnDefinition = "varchar(45)", nullable = false)
    private String accountName;

    @Column(columnDefinition = "varchar(45)", nullable = false)
    @Size(min = 6, max = 16)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE )
    @JoinTable(
            name = "accounts_roles",
            joinColumns = {@JoinColumn(name = "account_id", referencedColumnName = "accountId")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "roleId")}
    )
    private List<Role> roles = new ArrayList<>();

    public Account() {
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Account(Long accountId, String accountName, String password) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.password = password;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
