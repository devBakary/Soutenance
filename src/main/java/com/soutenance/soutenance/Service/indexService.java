package com.soutenance.soutenance.Service;


import com.soutenance.soutenance.Modele.Index;

import java.util.List;

public interface indexService {

    Index creerindex(Index index);

    Index modifierindex(Index index, Long id);

    List<Index> afficherIndex();

    List<Index> afficherIndexId(Long id);
}
