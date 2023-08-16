package com.tfa.service;

import com.tfa.entite.ProduitEntity;
import com.tfa.model.ProduitModel;
import com.tfa.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProduitService {

    private final ProduitRepository produitRepository;
    private final ModelMapper mapper;
    public ProduitEntity definirProduit(ProduitModel model) {

        ProduitEntity produitInDB = produitRepository.findByReference (model.getReference ());

        model.setReference (StringUtils.substring (UUID.randomUUID ().toString ().toUpperCase ()
                .replace ("_", "-"),0,18));
        if (Objects.nonNull (produitInDB)) {
            log.warn ("Il est pas possible de créer un produit avec la reference fournie {}",model.getReference ());
            throw new InputMismatchException (String.format ("Un produit a la reference %s",model.getReference ()));
        }
        log.info ("Creation d'un nouveau produit");
        ProduitEntity produit = mapper.map (model, ProduitEntity.class);
        return produitRepository.saveAndFlush (produit);
    }


    public ProduitEntity obtenirProduitParRef( String reference) {

        return produitRepository.findByReference (reference);
    }


    public List<ProduitEntity> obtenirProduitParCat(String categorie) {
        return null;
    }


    public List<ProduitEntity> obtenirProduits() {
        return null;
    }
}
