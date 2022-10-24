package com.soutenance.soutenance.Service;

import com.soutenance.soutenance.Modele.Dette;

import java.util.List;

public interface DetteService {

    Dette creer(Dette dette);

    List<Dette> afficherListe();

    Dette modifier(Dette dette, Long id);

    void supprimer(Long id);
}
