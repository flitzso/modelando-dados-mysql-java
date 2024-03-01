package com.database.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public Long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBannerAvatar() {
        return bannerAvatar;
    }

    public void setBannerAvatar(String bannerAvatar) {
        this.bannerAvatar = bannerAvatar;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}