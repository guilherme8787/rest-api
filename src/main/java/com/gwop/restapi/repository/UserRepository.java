package com.gwop.restapi.repository;

import com.gwop.restapi.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Integer> {
}
