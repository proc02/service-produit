package com.tfa.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProduitModel {

    private String reference;
    private String libelle;
    private String description;
    private String categorie;
    private BigDecimal prix;
}
