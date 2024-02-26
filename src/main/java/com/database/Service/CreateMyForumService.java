package com.database.Service;

import com.database.Entity.CreateMyForum;
import com.database.Repository.CreateMyForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateMyForumService {

    @Autowired
    private CreateMyForumRepository createMyForumRepository;

    public CreateMyForum createForum(CreateMyForum forum) {
        return createMyForumRepository.save(forum);
    }

    public CreateMyForum getForum(int id) {
        return createMyForumRepository.findById(id).orElse(null);
    }

    // Other methods for CRUD operations or additional business logic
}