package com.database.Service;

import com.database.Entity.Profile;
import com.database.Repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Profile createProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public Profile getProfile(int id) {
        return profileRepository.findById(id).orElse(null);
    }

    // Other methods for CRUD operations or additional business logic
}