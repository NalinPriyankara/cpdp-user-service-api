package com.prime.quickcart.user_service_api.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestUserDTO {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
}
