package tech.cspioneer.tech.oneblog.DTO;

import lombok.Data;

@Data
public class TokenDTO {
    private String accessToken;
    private String refreshToken;
}
