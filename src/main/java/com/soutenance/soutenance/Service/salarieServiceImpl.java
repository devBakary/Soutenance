package com.soutenance.soutenance.Service;

import com.soutenance.soutenance.Modele.Salarie;
import com.soutenance.soutenance.Repository.SalarieRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Data
public class salarieServiceImpl implements salarieService{

    @Autowired
    private SalarieRepository salarieRepository;

    @Override
    public Salarie creersalarie(Salarie salarie) {
        return salarieRepository.save(salarie);
    }

    @Override
    public List<Salarie> listeSalarie() {
        return salarieRepository.findAll();
    }

    @Override
    public List<Salarie> trouversalarieParId(Long id) {

        return salarieRepository.salarieparId(id);
    }

    @Override
    public Salarie modifierSalarie(Salarie salarie, Long id) {
        Salarie salarieUpdate = salarieRepository.findById(id).get();
        salarieUpdate.setNom(salarie.getNom());
        salarieUpdate.setPrenom(salarie.getPrenom());
        salarieUpdate.setNumero(salarie.getNumero());
        salarieUpdate.setAdresse(salarie.getAdresse());
        salarieUpdate.setSalaire(salarie.getSalaire());
        return salarieRepository.saveAndFlush(salarie);
    }

    @Override
    public Salarie supprimerSalarie(Long id) {
        return null;
    }
}
