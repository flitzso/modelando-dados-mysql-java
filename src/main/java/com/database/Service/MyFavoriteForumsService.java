package com.database.Service;

import com.database.Entity.MyFavoriteForums;
import com.database.Repository.MyFavoriteForumsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyFavoriteForumsService {

    @Autowired
    private MyFavoriteForumsRepository myFavoriteForumsRepository;

    public MyFavoriteForums addFavoriteForumToUser(MyFavoriteForums favoriteForums) {
        return myFavoriteForumsRepository.save(favoriteForums);
    }

    // Other methods for CRUD operations or additional business logic
}