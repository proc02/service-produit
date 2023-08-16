package com.tfa.controller;

import com.tfa.entite.ProduitEntity;
import com.tfa.model.ProduitModel;
import com.tfa.service.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produits")
@RequiredArgsConstructor
public class ProduitController {

    private final ProduitService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity <ProduitEntity> definirProduit(@RequestBody ProduitModel model) {
        return ResponseEntity.ok (service.definirProduit (model));
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value ="refs/{reference}" )
    public ResponseEntity <ProduitEntity> obtenirProduitParRef(@PathVariable String reference) {
        return null;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value ="cats/{categorie}" )
    public ResponseEntity <List<ProduitEntity>> obtenirProduitParCat(@PathVariable String categorie) {
        return null;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public ResponseEntity <List<ProduitEntity>> obtenirProduits() {
        return null;
    }
}
