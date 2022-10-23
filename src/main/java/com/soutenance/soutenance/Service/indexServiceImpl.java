package com.soutenance.soutenance.Service;


import com.soutenance.soutenance.Modele.Index;
import com.soutenance.soutenance.Repository.indexRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@AllArgsConstructor
public class indexServiceImpl implements indexService{

    @Autowired
    private com.soutenance.soutenance.Repository.indexRepository indexRepository;

    @Override
    public Index creerindex(Index index) {
        return indexRepository.save(index);
    }

    @Override
    public Index modifierindex(Index index, Long id) {
        Index indexUpdate = indexRepository.findById(id).get();
        indexUpdate.setIndex(index.getIndex());

        return indexRepository.saveAndFlush(index);
    }

    @Override
    public List<Index> afficherIndex() {
        return indexRepository.findAll();
    }

    @Override
    public List<Index> afficherIndexId(Long id) {
        return indexRepository.indexparId(id);
    }
}
