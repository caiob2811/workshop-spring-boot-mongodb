package com.caiobomfim.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.caiobomfim.workshomongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository <User, String> {

}
