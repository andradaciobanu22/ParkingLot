package org.example.parkinglot.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class UserGroup {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String userGroup;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @NotNull
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @NotNull
    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }


}