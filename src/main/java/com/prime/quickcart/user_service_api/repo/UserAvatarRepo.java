package com.prime.quickcart.user_service_api.repo;

import com.prime.quickcart.user_service_api.entity.User;
import com.prime.quickcart.user_service_api.entity.UserAvatar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAvatarRepo extends JpaRepository<UserAvatar, String> {

}
