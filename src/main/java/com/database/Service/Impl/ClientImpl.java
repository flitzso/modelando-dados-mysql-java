package com.database.Service.Impl;

import com.database.DTO.ClientDTO;
import com.database.DTO.LoginDTO;
import com.database.Entity.Client;
import com.database.LoginResponse.LoginMessage;
import com.database.Repository.ClientRepository;
import com.database.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ClientImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addClient(ClientDTO clientDTO) {
        return null;
    }

    @Override
    public String createClient(ClientDTO clientDTO) {
        // Criar um novo objeto Client com os dados do DTO
        Client client = new Client(
                clientDTO.getId(),
                clientDTO.getFirstName(),
                clientDTO.getLastName(),
                clientDTO.getBirthday(),
                clientDTO.getGender(),
                clientDTO.getEmail(),
                clientDTO.getPassword()
        );

        // Salvar o cliente no repositório
        clientRepository.save(client);

        return "Client created successfully";
    }

    @Override
    public LoginMessage loginClient(LoginDTO loginDTO) {
        Client client = clientRepository.findByEmail(loginDTO.getEmail());
        if (client != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = client.getPassword();
            if (passwordEncoder.matches(password, encodedPassword)) {
                return new LoginMessage("Login Success", true);
            } else {
                return new LoginMessage("Password does not match", false);
            }
        } else {
            return new LoginMessage("Email does not exist", false);
        }
    }
}
