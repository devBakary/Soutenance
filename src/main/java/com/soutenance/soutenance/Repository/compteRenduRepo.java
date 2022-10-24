package com.soutenance.soutenance.Repository;

import com.soutenance.soutenance.Modele.Client;
import com.soutenance.soutenance.Modele.CompteRendu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface compteRenduRepo extends JpaRepository<CompteRendu, Long> {

    @Query(
            value = "Select * from client where id = :id",
            nativeQuery = true
    )
    public CompteRendu CompteparId(Long id);
}
