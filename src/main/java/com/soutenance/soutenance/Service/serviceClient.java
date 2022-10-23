package com.soutenance.soutenance.Service;
import com.soutenance.soutenance.Modele.Client;

import java.util.List;


public interface serviceClient {

    //methode permettant de creer un client
    Client creerclient(Client client);

    //methode permettant d'afficher la liste des clients
    List<Client> listeClient();

    //methode permettant de recuperer un client par son id
    List<Client> trouverclientParId(Long id);

    //La methode permettant de modifier un client
    Client modifierClient(Client client, Long id);

    //Methode permettant de supprimer un client
    Client supprimerClient(Long id);

}
