package com.database.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "new_forum")
public class NewForum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_forum", length = 100)
    private String nameForum;

    @Column(length = 100)
    private String categories;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(length = 255)
    private String avatar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameForum() {
        return nameForum;
    }

    public void setNameForum(String nameForum) {
        this.nameForum = nameForum;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}