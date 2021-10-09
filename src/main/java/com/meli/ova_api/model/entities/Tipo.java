package com.meli.ova_api.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_tipo", length = 3)
    private Integer idTipo;

    @Column(length = 15)
    private String nombre;

    // -- Relaciones --
    @OneToOne
    @JoinColumn(name = "id_multimedia", referencedColumnName = "id_multimedia")
    private Multimedia itemMultimedia;
}
