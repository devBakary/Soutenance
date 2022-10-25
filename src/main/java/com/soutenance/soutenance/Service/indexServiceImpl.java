package com.soutenance.soutenance.Service;


import com.soutenance.soutenance.Modele.NumeroIndex;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class indexServiceImpl implements indexService{

    @Autowired
    private com.soutenance.soutenance.Repository.indexRepository indexRepository;

    @Override
    public NumeroIndex creerindex(NumeroIndex index) {
        return indexRepository.save(index);
    }

    @Override
    public NumeroIndex modifierindex(NumeroIndex index, Long id) {
        NumeroIndex indexUpdate = indexRepository.findById(id).get();
        indexUpdate.setNumero(index.getNumero());

        return indexRepository.saveAndFlush(index);
    }

    @Override
    public List<NumeroIndex> afficherIndex() {
        return indexRepository.findAll();
    }

    @Override
    public List<NumeroIndex> afficherIndexId(Long id) {
        return indexRepository.indexparId(id);
    }
}
