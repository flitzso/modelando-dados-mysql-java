package com.database.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "create_my_forum")
public class CreateMyForum {

    @Id
    private int id;

    @Column(name = "name_forum", length = 100)
    private String nameForum;

    @Column(length = 100)
    private String categories;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(length = 255)
    private String avatar;

    // Getters and setters
}