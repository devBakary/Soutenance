package com.soutenance.soutenance.Service;

import com.soutenance.soutenance.Modele.Client;
import com.soutenance.soutenance.Repository.clientRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
@Service
public class clientServiceImpl implements serviceClient {

    @Autowired
    private com.soutenance.soutenance.Repository.clientRepository clientRepository;

    @Override
    public Client creerclient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> listeClient() {
        return clientRepository.findAll();
    }

    @Override
    public List<Client> trouverclientParId(Long id) {
        return Collections.singletonList(clientRepository.clientparId(id));
    }


    @Override
    public Client modifierClient(Client client, Long id) {
        Client clientUpdate = clientRepository.findById(id).get();
        clientUpdate.setNom(client.getNom());
        clientUpdate.setPrenom(client.getPrenom());
        clientUpdate.setAdresse(client.getAdresse());
        clientUpdate.setNumero(client.getNumero());
        return clientRepository.saveAndFlush(clientUpdate);
    }

    @Override
    public Client supprimerClient(Long id) {
       return null;
    }
}
