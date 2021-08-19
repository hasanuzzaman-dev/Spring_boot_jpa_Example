package com.hasan.springbootjpaexample.dao;

import com.hasan.springbootjpaexample.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
