package com.database.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "my_favorite_forums")
public class MyFavoriteForums {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Client userId;

    @ManyToOne
    @JoinColumn(name = "forum_id")
    private CreateMyForum forumId;

    // Getters and setters
}