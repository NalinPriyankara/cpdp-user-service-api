package com.prime.quickcart.user_service_api.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseUserAvatarDTO {
    private String hash;
    private String directory;
    private String fileName;
    private String resourceUrl;
}
