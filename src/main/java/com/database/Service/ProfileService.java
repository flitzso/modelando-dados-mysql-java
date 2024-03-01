package com.database.Service;

import com.database.Entity.Client;
import com.database.Entity.Profile;
import com.database.Repository.ClientRepository;
import com.database.Repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private ClientRepository clientRepository;

    public Profile createProfile(Profile profile, int clientId) {
        Optional<Client> clientOptional = clientRepository.findById(clientId);
        if (clientOptional.isPresent()) {
            Client client = clientOptional.get();
            profile.setClient(client);
            return profileRepository.save(profile);
        } else {
            return null; // Retorna null se o cliente não for encontrado
        }
    }

    // Outros métodos conforme necessário
}