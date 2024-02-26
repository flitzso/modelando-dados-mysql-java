package com.database.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Profile")
public class Profile {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(length = 255)
    private String avatar;

    @Column(name = "bannerAvatar", length = 255)
    private String bannerAvatar;

    @Column(length = 50)
    private String country;

    @Column(columnDefinition = "TEXT")
    private String bios;

    // Getters and setters
}