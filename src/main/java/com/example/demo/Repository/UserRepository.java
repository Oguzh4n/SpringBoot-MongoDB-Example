package com.example.demo.Repository;

import com.example.demo.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    List<User> findByName(String name);

    //Does the same as the method above
/*  @Query("{ 'name' : ?0 }")
    List<User> findUsersByName(String name);*/

    void deleteById(String id);
}
