package com.meli.ova_api.repository;

import com.meli.ova_api.model.entities.Multimedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMultimediaRepository extends JpaRepository<Multimedia, Integer> {
}
