package pe.dinnra_web.sistema_gestion.api.model.dto.response;

import io.jsonwebtoken.Claims;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class LoginResponse {

    private String refreshToken;

    private String token;

    private Claims claims;

}
