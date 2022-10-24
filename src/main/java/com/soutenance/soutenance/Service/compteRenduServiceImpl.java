package com.soutenance.soutenance.Service;

import com.soutenance.soutenance.Modele.CompteRendu;
import com.soutenance.soutenance.Repository.compteRenduRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor
public class compteRenduServiceImpl implements compteRenduService{

    @Autowired
    private compteRenduRepo compteRepo;


    @Override
    public CompteRendu creerRendu(CompteRendu compteRendu) {
        return compteRepo.save(compteRendu);
    }


    @Override
    public List<CompteRendu> afficherCR() {
        return compteRepo.findAll();
    }

    @Override
    public List<CompteRendu> afficherCRId(Long id) {
        return (List<CompteRendu>) compteRepo.CompteparId(id);
    }
}
