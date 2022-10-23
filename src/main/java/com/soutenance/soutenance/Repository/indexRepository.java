package com.soutenance.soutenance.Repository;

import com.soutenance.soutenance.Modele.Index;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface indexRepository extends JpaRepository<Index, Long> {

    @Query(value = "select * from index where id = :id", nativeQuery = true)

    List<Index> indexparId(Long id);
}
