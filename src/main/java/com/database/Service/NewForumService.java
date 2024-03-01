package com.database.Service;

import com.database.DTO.NewForumDTO;
import com.database.Entity.NewForum;
import com.database.Repository.NewForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewForumService {

    @Autowired
    private NewForumRepository newForumRepository;

    public NewForum createForum(NewForum forum) {
        return newForumRepository.save(forum);
    }

    public NewForum getForum(int id) {
        return newForumRepository.findById(id).orElse(null);
    }

    public String createForum(NewForumDTO newForumDTO) {
        try {
            // Convert DTO to entity object
            NewForum newForum = new NewForum();
            newForum.setNameForum(newForumDTO.getNameForum());
            newForum.setCategories(newForumDTO.getCategories());
            newForum.setDescription(newForumDTO.getDescription());
            newForum.setAvatar(newForumDTO.getAvatar());

            // Save the entity object using the repository
            NewForum savedForum = newForumRepository.save(newForum);

            // Return a message indicating success
            return "Forum created with ID: " + savedForum.getId();
        } catch (Exception e) {
            // Handle any exceptions that occur during forum creation
            return "Failed to create forum: " + e.getMessage();
        }
    }

    public List<NewForum> getAllForums() {
        return newForumRepository.findAll();
    }
    // Other methods for CRUD operations or additional business logic
}
