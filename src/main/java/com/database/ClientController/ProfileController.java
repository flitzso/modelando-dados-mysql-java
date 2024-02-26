package com.database.ClientController;

import com.database.Entity.Profile;
import com.database.Service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/profiles")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping
    public Profile createProfile(@RequestBody Profile profile) {
        return profileService.createProfile(profile);
    }

    @GetMapping("/{id}")
    public Profile getProfile(@PathVariable int id) {
        return profileService.getProfile(id);
    }

    // Other CRUD endpoints as needed
}