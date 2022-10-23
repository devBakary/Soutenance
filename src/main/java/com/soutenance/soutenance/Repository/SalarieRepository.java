package com.soutenance.soutenance.Repository;

import com.soutenance.soutenance.Modele.Salarie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalarieRepository extends JpaRepository<Salarie, Long > {

    @Query(value = "select * from salarie where id = :id", nativeQuery = true)
    List<Salarie> salarieparId(Long id);
}
