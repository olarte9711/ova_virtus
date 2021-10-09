package com.meli.ova_api.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyecto", length = 8)
    private Integer idProyecto;

    @Column(length = 25)
    private String nombre;

    // -- Relaciones --
    @OneToOne
    @JoinColumn(name = "id_archivo", referencedColumnName = "id_archivo")
    private Archivo archivo;

    @ManyToOne
    @JoinColumn(name = "id_plantilla", referencedColumnName = "id_plantilla")
    private Plantilla plantilla;
}
