package com.prime.quickcart.user_service_api.repo;

import com.prime.quickcart.user_service_api.entity.ShippingAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingAddressRepo extends JpaRepository<ShippingAddress, String> {

}
