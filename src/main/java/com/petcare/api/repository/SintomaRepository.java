package com.petcare.api.repository;

import com.petcare.api.model.entity.Sintoma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SintomaRepository extends JpaRepository<Sintoma, Long> {
}