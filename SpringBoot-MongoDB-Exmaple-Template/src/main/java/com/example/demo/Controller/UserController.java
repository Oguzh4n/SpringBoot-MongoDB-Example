package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class UserController {

    //Todo:
    //  1. Annotiere die Klasse, um aus diesem einen RestController zu erzeugen

    //Todo: Create/Update Funktion
    //  2. Implementiere eine Funktion zum Erstellen oder Updaten eines Nutzers:
    //      - Die Funktion soll über den Link "http://localhost:8080/user" aufgerufen werden
    //      - Die Funktion soll mittels der Service Klasse einen neuen Nutzer erzeugen oder einen bestehenden Nutzer updaten
    //      - Die Funktion soll eine "ResponseEntity" mit dem erzeugten Nutzer und mit einem passenden Statuscode zurückgeben

    //Todo: Read Funktion
    //  3. Implementiere eine Funktion zum Abrufen von Nutzern:
    //      - Die Funktion soll über den Link "http://localhost:8080/user" aufgerufen werden
    //      - Die Funktion soll mittels der Service Klasse bestehende Nutzer mittels eines Namens finden
    //      - Die Funktion soll eine "ResponseEntity" mit den gefundenen Nutzern und mit einem passenden Statuscode zurückgeben

    //Todo: Delete Funktion
    //  4. Implementiere eine Funktion zum Löschen eines Nutzers:
    //      - Die Funktion soll über den Link "http://localhost:8080/user/delete" aufgerufen werden
    //      - Die Funktion soll mittels der Service Klasse einen Nutzer mittels der Nutzer Id löschen
    //      - Die Funktion soll eine "ResponseEntity" mit der gelöschten Id und einem passenden Statuscode zurückgeben

}
