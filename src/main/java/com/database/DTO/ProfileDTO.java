package com.database.DTO;

public class ProfileDTO {

    private int id;
    private int clientId;
    private String avatar;
    private String bannerAvatar;
    private String country;
    private String bios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
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