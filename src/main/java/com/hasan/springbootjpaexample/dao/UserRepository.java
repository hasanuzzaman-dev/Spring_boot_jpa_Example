package com.hasan.springbootjpaexample.dao;

import com.hasan.springbootjpaexample.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

/*    List<User> findByName(String name);

    List<User> findNameAndCity(String name, String city);
    List<User> findByNameStartingWith(String prefix);
    List<User> findByNameEndingWith(String suffix);
    List<User> findByNameContaining(String words);
    List<User> findByNameLike(String likePattern);
    List<User> findByAgeLessThan(int age);
    List<User> findByAgeGreaterThanEqual(int age);
    List<User> findByAgeIn(Collection<Integer> ages);
    List<User> findByNameOrderByAge(String name);*/

    // JPQL

    @Query("select u from User u")
    public List<User> getAllUser();

    @Query("select u from User u where u.name =:name")
    List<User> getUserByName(@Param("name") String name);

    @Query("select u from User u where u.name =:name and u.city =:city")
    List<User> getUserByNameAndCity(@Param("name") String name, @Param("city") String city);

    // native query
    @Query(value = "select * from user", nativeQuery = true)
    List<User> getUsers();
}
