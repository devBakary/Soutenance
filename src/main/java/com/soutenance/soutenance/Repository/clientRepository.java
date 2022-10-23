package com.soutenance.soutenance.Repository;

import com.soutenance.soutenance.Modele.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface clientRepository extends JpaRepository<Client, Long> {

    @Query(
            value = "Select * from client where id = :id",
            nativeQuery = true
    )
   public Client clientparId(Long id);

}
