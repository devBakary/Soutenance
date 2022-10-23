package com.soutenance.soutenance.Controller;

import com.soutenance.soutenance.Modele.Client;
import com.soutenance.soutenance.Service.serviceClient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class clientController {

    @Autowired
    private com.soutenance.soutenance.Service.serviceClient serviceClient;

    //cration du client
    @PostMapping("/creer")
    public Client creerclient(@RequestBody Client client){
        return serviceClient.creerclient(client);
    }

    @GetMapping("/afficher")
    public List<Client> listeClient(){
        return serviceClient.listeClient();
    }

    @GetMapping("/clientparId/{id}")
    public List<Client> trouverclientParId(@PathVariable Long id){
        return serviceClient.trouverclientParId(id);
    }

    @PutMapping("/modifier/{id}")
    public Client modifierClient(@RequestBody Client client, @PathVariable Long id){
        return serviceClient.modifierClient(client, id);
    }
}
