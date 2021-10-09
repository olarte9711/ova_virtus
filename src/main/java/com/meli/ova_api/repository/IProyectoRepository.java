package com.meli.ova_api.repository;

import com.meli.ova_api.model.entities.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProyectoRepository extends JpaRepository<Proyecto, Integer> {
}
