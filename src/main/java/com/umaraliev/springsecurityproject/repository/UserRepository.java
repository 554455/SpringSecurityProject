package com.umaraliev.springsecurityproject.repository;

import com.umaraliev.springsecurityproject.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);

}
