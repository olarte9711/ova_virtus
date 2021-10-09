package com.meli.ova_api.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter

@Entity
@Table(name = "Plantilla")
public class Plantilla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plantilla", length = 8)
    private Integer idPlantilla;

    @Column(length = 8)
    private String nombre;

    // -- Relaciones --
    @OneToMany(mappedBy = "plantilla")
    private Set<Proyecto> proyectos;

    @OneToMany(mappedBy = "plantilla")
    //NOTA:  Supuestamente con autoreferenciar la tabla genera una entidad debil, revisar
    private Set<Diapositiva> diapositivas;

    @ManyToMany
    @JoinTable(
            name = "posee",
            joinColumns = @JoinColumn(name = "id_plantilla"),
            inverseJoinColumns = @JoinColumn(name = "id_multimedia"))
    private Set<Multimedia> itemsMultimedia;
}
