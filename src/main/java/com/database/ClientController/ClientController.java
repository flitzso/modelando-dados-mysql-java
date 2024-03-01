package com.database.ClientController;

import com.database.DTO.ClientDTO;
import com.database.DTO.LoginDTO;
import com.database.LoginResponse.LoginMessage;
import com.database.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping(path = "/save")
    public String saveClient(@RequestBody ClientDTO clientDTO) {
        String id = clientService.addClient(clientDTO);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginClient(@RequestBody LoginDTO loginDTO) {
        LoginMessage loginResponse = clientService.loginClient(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }

    @PostMapping("/create")
    public String createClient(@RequestBody ClientDTO clientDTO) {

        return clientService.createClient(clientDTO);
    }
}
