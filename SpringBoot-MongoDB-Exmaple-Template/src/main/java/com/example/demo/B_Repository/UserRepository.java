package com.example.demo.B_Repository;

import com.example.demo.A_Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    //Todo:
    //  1. Annotiere das Interface, um aus diesem ein Repository zu erzeugen
    //  2. Implementiere eine Funktion, um eine Liste von User mittels ihres Namens zu suchen
    //  3. Implementiere eine Funktion, um einen User mittels seiner Id zu löschen

}
