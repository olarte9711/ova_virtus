package com.meli.ova_api.repository;

import com.meli.ova_api.model.entities.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoRepository extends JpaRepository<Tipo, Integer> {
}
