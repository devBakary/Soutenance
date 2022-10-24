package com.soutenance.soutenance.Service;

import com.soutenance.soutenance.Modele.CompteRendu;
import org.springframework.stereotype.Service;

import java.util.List;


public interface compteRenduService {

    CompteRendu creerRendu(CompteRendu compteRendu);

    List<CompteRendu> afficherCR();
}
