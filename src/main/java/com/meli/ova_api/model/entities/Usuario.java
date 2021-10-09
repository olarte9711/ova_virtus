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
    @Column(name = "id", length = 8)
    private Long id;

    @Column(length = 25)
    private String name;

    private String surname;
    private String username;

    @Column(length = 25)
    private String password;

    private String email;

    private Long number;

    // -- Relaciones --
    @ManyToMany
    @JoinTable(
            name = "crea",
            joinColumns = @JoinColumn(name = "id_usuario"),
            inverseJoinColumns = @JoinColumn(name = "id_archivo"))
    private Set<Archivo> archivos;
}
