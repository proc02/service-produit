package com.tfa.repository;

import com.tfa.entite.ProduitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository extends JpaRepository<ProduitEntity,Long> {

    ProduitEntity findByReference (String reference);
    List<ProduitEntity> findByCategorie(String categorie);
}
