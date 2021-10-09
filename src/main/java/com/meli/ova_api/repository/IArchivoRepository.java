package com.meli.ova_api.repository;

import com.meli.ova_api.model.entities.Archivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArchivoRepository extends JpaRepository<Archivo, Integer> {
}
