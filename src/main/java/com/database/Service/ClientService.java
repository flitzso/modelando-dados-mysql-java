package com.database.Service;

import com.database.DTO.ClientDTO;
import com.database.DTO.LoginDTO;
import com.database.LoginResponse.LoginMessage;

public interface ClientService {
    String addClient(ClientDTO clientDTO);
    // Define the createClient method
    String createClient(ClientDTO clientDTO);
    // Other methods...
    LoginMessage loginClient(LoginDTO loginDTO);
}

