package com.database.ClientController;

import com.database.Entity.MyFavoriteForums;
import com.database.Service.MyFavoriteForumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/favoriteforums")
public class MyFavoriteForumsController {

    @Autowired
    private MyFavoriteForumsService myFavoriteForumsService;

    @PostMapping
    public MyFavoriteForums addFavoriteForumToUser(@RequestBody MyFavoriteForums favoriteForums) {
        return myFavoriteForumsService.addFavoriteForumToUser(favoriteForums);
    }

    // Other CRUD endpoints as needed
}