package com.database.Service;

import com.database.Entity.MyForums;
import com.database.Repository.MyForumsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyForumsService {

    @Autowired
    private MyForumsRepository myForumsRepository;

    public MyForums addForumToUser(MyForums myForums) {
        return myForumsRepository.save(myForums);
    }

    // Other methods for CRUD operations or additional business logic
}