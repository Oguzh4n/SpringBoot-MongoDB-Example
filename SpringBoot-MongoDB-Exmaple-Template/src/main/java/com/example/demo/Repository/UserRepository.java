package com.example.demo.Repository;

import com.example.demo.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    //Todo:
    //  1. Annotiere das Interface, um aus diesem ein Repository zu erzeugen
    //  2. Implementiere eine Funktion, um eine Liste von User mittels ihres Namens zu suchen
    //  3. Implementiere eine Funktion, um einen User mittels seiner Id zu löschen

}
