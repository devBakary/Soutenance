package com.soutenance.soutenance.Service;

import com.soutenance.soutenance.Modele.Depense;

import java.util.List;

public interface DepenseService {

    Depense creerdepense(Depense depense);

    public List<Depense> afficherdepenses();

    Depense modifier(Depense depense, Long id);
}
