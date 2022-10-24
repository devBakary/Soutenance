package com.soutenance.soutenance.Service;

import com.soutenance.soutenance.Modele.Motif;
import com.soutenance.soutenance.Repository.MotifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotifServiceImpl implements MotifService {

    @Autowired
    private MotifRepository motifRepository;

    @Override
    public Motif creer(Motif motif) {
        return motifRepository.save(motif);
    }
}
