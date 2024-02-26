package com.database.ClientController;

import com.database.Entity.CreateMyForum;
import com.database.Service.CreateMyForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/forums")
public class CreateMyForumController {

    @Autowired
    private CreateMyForumService createMyForumService;

    @PostMapping
    public CreateMyForum createForum(@RequestBody CreateMyForum forum) {
        return createMyForumService.createForum(forum);
    }

    @GetMapping("/{id}")
    public CreateMyForum getForum(@PathVariable int id) {
        return createMyForumService.getForum(id);
    }

    // Other CRUD endpoints as needed
}