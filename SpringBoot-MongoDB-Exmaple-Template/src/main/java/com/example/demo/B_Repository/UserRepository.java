package com.example.demo.B_Repository;

import com.example.demo.A_Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository {
    //Todo:
    //  1. Annotiere das Interface, um diesen als Repository kenntlich zu machen
    //  2. Das Interface muss zunächst von "MongoRepository" erben
    //  3. Implementiere eine Funktion, um eine Liste von User mittels ihres Namens zu suchen
    //  4. Implementiere eine Funktion, um einen User mittels seiner Id zu löschen

}
