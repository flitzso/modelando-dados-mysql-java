package com.database.ClientController;

import com.database.DTO.NewForumDTO;
import com.database.Entity.NewForum;
import com.database.Service.NewForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/forums")
public class NewForumController {

    @Autowired
    private NewForumService newForumService;

    @GetMapping("/list")
    public List<NewForum> getAllForums() {
        return newForumService.getAllForums();
    }

    @PostMapping("/create")
    public ResponseEntity<String> createForum(@RequestBody NewForumDTO newForumDTO) {
        try {
            newForumService.createForum(newForumDTO);
            return ResponseEntity.status(HttpStatus.OK).body("Forum created successfully."); // Retorna status 200 OK
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create forum: " + e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public NewForum getForum(@PathVariable int id) {
        return newForumService.getForum(id);
    }
}