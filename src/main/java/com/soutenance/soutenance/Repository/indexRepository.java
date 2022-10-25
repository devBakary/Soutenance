package com.soutenance.soutenance.Repository;

import com.soutenance.soutenance.Modele.NumeroIndex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface indexRepository extends JpaRepository<NumeroIndex, Long> {

    @Query(value = "select * from index where id = :id", nativeQuery = true)

    List<NumeroIndex> indexparId(Long id);
}
