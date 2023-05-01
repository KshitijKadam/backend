package com.nexahomes.loginproject.repo;

import com.nexahomes.loginproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

    @Query(value = "SELECT * FROM `login-demo`.users where username= ?1 and password= ?2", nativeQuery=true)
    List<User> userIsTrue(String queryString1, String queryString2);

}