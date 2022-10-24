package com.soutenance.soutenance.Service;

import com.soutenance.soutenance.Modele.Depense;
import com.soutenance.soutenance.Repository.DepenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepenseServiceImpl implements DepenseService{

    @Autowired
    private DepenseRepository depenseRepository;

    @Override
    public Depense creerdepense(Depense depense) {
        return depenseRepository.save(depense);
    }

    @Override
    public List<Depense> afficherdepenses() {
        return depenseRepository.findAll();
    }

    @Override
    public Depense modifier(Depense depense, Long id) {
        Depense depenseUpdate = depenseRepository.findById(id).get();
        depenseUpdate.setLibelle(depense.getLibelle());
        depenseUpdate.setMontant(depense.getMontant());
        return depenseRepository.saveAndFlush(depense);
    }

}
