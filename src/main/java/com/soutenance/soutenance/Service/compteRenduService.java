package com.soutenance.soutenance.Service;

import com.soutenance.soutenance.Modele.CompteRendu;

import java.util.List;

public interface compteRenduService {

    CompteRendu creerRendu(CompteRendu compteRendu);

    CompteRendu modifierCR(CompteRendu compteRendu, Long id);

    List<CompteRendu> afficherCR();

    List<CompteRendu> afficherCRId(Long id);
}
