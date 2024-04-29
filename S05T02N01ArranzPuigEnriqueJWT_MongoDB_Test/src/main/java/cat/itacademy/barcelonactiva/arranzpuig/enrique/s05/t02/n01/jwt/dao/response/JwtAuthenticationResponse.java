package cat.itacademy.barcelonactiva.arranzpuig.enrique.s05.t02.n01.jwt.dao.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtAuthenticationResponse {

    private String token;
}
