package com.meli.ova_api.repository;

import com.meli.ova_api.model.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query( "FROM Usuario U " +
            "WHERE U.username =:username")
    Optional<Usuario> findByUsername(@Param("username") String username);

}
