package com.prime.quickcart.user_service_api.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseUserDTO {
    private String username;
    private String firstName;
    private String lastName;
    private boolean activeStatus;
    private ResponseUserAvatarDTO avatar;   //if an avatar exists, return the actual value. if not, the system must send a null value
    private ResponseBillingAddressDTO billingAddress;   //if value exists ? value : null
    private ResponseShippingAddressDTO shippingAddress; //if value exists ? value : null
}
