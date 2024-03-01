package com.database.ClientController;

import com.database.Entity.Profile;
import com.database.Service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/profiles")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping("/create")
    public ResponseEntity<String> createProfile(@RequestBody Profile profile, @RequestParam("clientId") int clientId) {
        Profile createdProfile = profileService.createProfile(profile, clientId);
        if (createdProfile != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Profile created with ID: " + createdProfile.getId());
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to create profile. Client not found.");
        }
    }

    // Outros endpoints conforme necessário
}
