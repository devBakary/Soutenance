package com.soutenance.soutenance.Service;

import com.soutenance.soutenance.Modele.Salarie;

import java.util.List;

public interface salarieService {

    //methode permettant de creer
    Salarie creersalarie(Salarie salarie);

    //methode permettant d'afficher la liste
    List<Salarie> listeSalarie();

    //methode permettant de recuperer un salarie par son id
    List<Salarie> trouversalarieParId(Long id);

    //methode permettant de modifier
    Salarie modifierSalarie(Salarie salarie, Long id);

    //Methode permettant de supprimer
    Salarie supprimerSalarie(Long id);
}
