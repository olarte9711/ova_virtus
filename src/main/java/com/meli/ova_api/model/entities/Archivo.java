package com.meli.ova_api.model.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter

@Entity
public class Archivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_archivo", length = 8)
    private Integer idArchivo;

    @Column(length = 15)
    private String categoria;
    // -- Relaciones --
    @ManyToMany(mappedBy = "archivos")
    private Set<Usuario> usuarios;

    @OneToOne(mappedBy = "archivo")
    private Proyecto proyecto;
}
