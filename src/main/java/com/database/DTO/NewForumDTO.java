package com.database.DTO;

public class NewForumDTO {

    private String nameForum;
    private String categories;
    private String description;
    private String avatar;

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
