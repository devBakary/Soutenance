package com.soutenance.soutenance.Service;

import com.soutenance.soutenance.Modele.CompteRendu;
import com.soutenance.soutenance.Repository.compteRenduRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
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
}
