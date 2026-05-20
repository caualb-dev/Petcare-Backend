package com.petcare.api.model.entity;

import com.petcare.api.model.enums.RoleUsuario;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoleUsuario role;

    @Column(nullable = false)
    private Boolean ativo = true;

    private Long veterinarioId;

    private String resetToken;

    private LocalDateTime resetTokenExpiracao;
}