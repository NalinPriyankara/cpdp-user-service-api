package com.prime.quickcart.user_service_api.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestShippingAddressDTO {
    private String country;
    private String city;
    private String street;
}
