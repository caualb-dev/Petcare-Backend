package com.petcare.api.repository;

import com.petcare.api.model.entity.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    List<Consulta> findByPetId(Long petId);
    List<Consulta> findByVeterinarioId(Long veterinarioId);
}