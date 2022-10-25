package com.soutenance.soutenance.Modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Depense  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date = new Date();
    private String libelle;
    private String montant;

    @ManyToOne
    @JoinColumn(name = "idcompterendu")
    private CompteRendu compteRendu;
}
