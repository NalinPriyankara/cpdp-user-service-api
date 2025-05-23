package com.prime.quickcart.user_service_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @Column(unique = true, nullable = false, name = "user_id")
    private int userId;
    @Column(unique = true, nullable = false, name = "user_name", length = 100)
    private String userName;
    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;
    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;
    @Column(name = "active_status", columnDefinition = "TINYINT")
    private boolean activeStatus;
    @Column(name = "otp", nullable = false)
    private int otp;

    @OneToOne(mappedBy = "user")
    private ShippingAddress shippingAddress;

    @OneToOne(mappedBy = "user")
    private BillingAddress billingAddress;

    @OneToOne(mappedBy = "user")
    private UserAvatar userAvatar;
}
