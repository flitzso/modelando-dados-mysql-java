package com.database.ClientController;

import com.database.Entity.MyForums;
import com.database.Service.MyForumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/myforums")
public class MyForumsController {

    @Autowired
    private MyForumsService myForumsService;

    @PostMapping
    public MyForums addForumToUser(@RequestBody MyForums myForums) {
        return myForumsService.addForumToUser(myForums);
    }

    // Other CRUD endpoints as needed
}