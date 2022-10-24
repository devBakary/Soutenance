package com.soutenance.soutenance.Service;

import com.soutenance.soutenance.Modele.Dette;
import com.soutenance.soutenance.Repository.DetteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetteServiceImpl implements DetteService{

    @Autowired
    DetteRepository detteRepository;

    @Override
    public Dette creer(Dette dette) {
        return detteRepository.save(dette);
    }

    @Override
    public List<Dette> afficherListe() {
        return detteRepository.findAll();
    }

    @Override
    public Dette modifier(Dette dette, Long id) {
        Dette detteUpdate = detteRepository.findById(id).get();
        detteUpdate.setMontant(dette.getMontant());
        detteUpdate.setMotif(dette.getMotif());
        return detteRepository.saveAndFlush(dette);
    }

    @Override
    public void supprimer(Long id) {

        detteRepository.deleteById(id);
    }
}
