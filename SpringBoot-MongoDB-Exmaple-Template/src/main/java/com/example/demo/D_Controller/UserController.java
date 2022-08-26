package com.example.demo.D_Controller;

import com.example.demo.A_Model.User;
import com.example.demo.C_Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

public class UserController {
    //Todo:
    //  1. Annotiere die Klasse, um diesen als RestController kenntlich zu machen

    //Todo: Create/Update Funktion
    //  2. Implementiere eine Funktion zum Erstellen oder Updaten eines Nutzers:
    //      - Die Funktion soll über die URL "http://localhost:8080/user" aufgerufen werden
    //      - Die Funktion soll mittels der Service Klasse einen neuen Nutzer erzeugen oder einen bestehenden Nutzer updaten
    //      - Ein neuer oder bestehender Nutzer soll über den Request Body übergeben werden
    //      - Die Funktion soll eine "ResponseEntity" mit dem erzeugten Nutzer und mit einem passenden Statuscode zurückgeben

    //Todo: Read Funktion
    //  3. Implementiere eine Funktion zum Abrufen von Nutzern:
    //      - Die Funktion soll über die URL "http://localhost:8080/user" aufgerufen werden
    //      - Die Funktion soll mittels der Service Klasse bestehende Nutzer mittels eines Namens finden
    //      - Der Name soll über einen Request Parameter übergeben werden
    //      - Die Funktion soll eine "ResponseEntity" mit den gefundenen Nutzern und mit einem passenden Statuscode zurückgeben

    //Todo: Delete Funktion
    //  4. Implementiere eine Funktion zum Löschen eines Nutzers:
    //      - Die Funktion soll über die URL "http://localhost:8080/user/delete" aufgerufen werden
    //      - Die Funktion soll mittels der Service Klasse einen Nutzer mittels der Nutzer Id löschen
    //      - Die Nutzer Id soll über einen Request Parameter übergeben werden
    //      - Die Funktion soll eine "ResponseEntity" mit der gelöschten Id und einem passenden Statuscode zurückgeben

    //Beispiel für einen Request Body:
/*  {
        "email": "maxmustermann@mail.com",
        "name": "max",
        "surname": "mustermann",
        "address": {
            "street": "Musterstrasse 10",
            "zipCode": "12345",
            "town": "Musterstadt"
         },
        "accountType": "FREE"
    }*/
}
