package com.prime.quickcart.user_service_api.dto.request;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestUserAvatarDTO {
    private MultipartFile file;
}
