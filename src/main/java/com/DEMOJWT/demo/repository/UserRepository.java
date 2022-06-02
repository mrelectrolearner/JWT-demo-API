package com.DEMOJWT.demo.repository;

import com.DEMOJWT.demo.dto.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

    Optional<User> findUserByUserName(String userName);
}
