package com.database.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "my_forums")
public class MyForums {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Client userId;

    @ManyToOne
    @JoinColumn(name = "forum_id")
    private NewForum forumId;

    // Getters and setters
}