package com.meli.ova_api.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter

@Entity
public class Multimedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_multimedia", length = 8)
    private Integer idMultimedia;

    @Column(length = 50)
    private String ubicacion;

    @Column(length = 5)
    private String extension;

    private Double peso;

    // -- Relaciones --
    @ManyToMany(mappedBy = "itemsMultimedia")
    private Set<Plantilla> plantillas;

    @OneToOne(mappedBy = "itemMultimedia")
    private Tipo tipo;
}
