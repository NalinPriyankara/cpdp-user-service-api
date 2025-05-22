package com.prime.quickcart.user_service_api.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseBillingAddressDTO {
    private String id;
    private String country;
    private String city;
    private String street;
}
