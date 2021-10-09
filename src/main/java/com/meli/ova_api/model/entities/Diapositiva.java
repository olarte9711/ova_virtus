package com.meli.ova_api.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
public class Diapositiva {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_diapositiva", length = 3)
    private Integer idDiapositiva;

    @Column(name = "num_diapositiva", length = 3)
    private Integer numDiapositiva;

    // -- Relaciones --
    @ManyToOne
    @JoinColumn(name = "id_plantilla", referencedColumnName = "id_plantilla")
    private Plantilla plantilla;
}
