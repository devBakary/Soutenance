package com.soutenance.soutenance.Service;


import com.soutenance.soutenance.Modele.NumeroIndex;

import java.util.List;

public interface indexService {

    NumeroIndex creerindex(NumeroIndex index);

    NumeroIndex modifierindex(NumeroIndex index, Long id);

    List<NumeroIndex> afficherIndex();

    List<NumeroIndex> afficherIndexId(Long id);
}
