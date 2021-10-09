package com.meli.ova_api.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", length = 8)
    private Integer idUsuario;

    @Column(length = 25)
    private String nombre;

    @Column(length = 25)
    private String contraseña;

    private String correo;

    // -- Relaciones --
    @ManyToMany
    @JoinTable(
            name = "crea",
            joinColumns = @JoinColumn(name = "id_usuario"),
            inverseJoinColumns = @JoinColumn(name = "id_archivo"))
    private Set<Archivo> archivos;
}
