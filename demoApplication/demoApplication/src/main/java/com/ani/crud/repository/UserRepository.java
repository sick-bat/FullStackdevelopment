package com.ani.crud.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.ani.crud.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {


    
}
