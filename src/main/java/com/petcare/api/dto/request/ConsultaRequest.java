package com.petcare.api.dto.request;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

public record ConsultaRequest(
        @NotNull(message = "Pet é obrigatório") Long petId,
        @NotNull(message = "Veterinário é obrigatório") Long veterinarioId,
        @NotNull(message = "Data é obrigatória") LocalDate data,
        String descricao,
        List<Long> sintomaIds,
        List<Long> medicamentoIds
) {}