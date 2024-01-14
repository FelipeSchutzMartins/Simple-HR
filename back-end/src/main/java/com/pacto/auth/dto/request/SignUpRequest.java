package com.pacto.auth.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignUpRequest {
    @NotNull(message = "Não pode ser nulo")
    @NotBlank(message = "Não pode estar vázio")
    private String email;
    @NotNull(message = "Não pode ser nulo")
    @NotBlank(message = "Não pode estar vázio")
    private String password;
}
