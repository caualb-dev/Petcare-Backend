package com.petcare.api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Map;

@Service
public class EmailService {

    @Value("${resend.api.key}")
    private String apiKey;

    private final RestClient restClient = RestClient.create();

    public void enviarLinkRecuperacao(String destinatario, String token) {
        String link = "http://localhost:5173/redefinir-senha?token=" + token;

        Map<String, Object> body = Map.of(
                "from", "PetCare <onboarding@resend.dev>",
                "to", destinatario,
                "subject", "Redefinição de senha — PetCare Manager",
                "html", "<p>Clique no link abaixo para redefinir sua senha:</p>" +
                        "<a href='" + link + "'>" + link + "</a>" +
                        "<p>Este link expira em 15 minutos.</p>"
        );

        restClient.post()
                .uri("https://api.resend.com/emails")
                .header("Authorization", "Bearer " + apiKey)
                .header("Content-Type", "application/json")
                .body(body)
                .retrieve()
                .toBodilessEntity();
    }
}