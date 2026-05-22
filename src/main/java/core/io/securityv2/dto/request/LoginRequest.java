package core.io.securityv2.dto.request;

import jakarta.validation.constraints.NotEmpty;

public record LoginRequest(@NotEmpty(message = "email é obrigatorio!") String email,
                           @NotEmpty(message = "senha é obrigatorio!") String password) {
}
