package controller;


import model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PersonController {

    public static List<Person> personList = new ArrayList<>(Arrays.asList(
            new Person(1L, "Ali", "ali@mail.com"),
            new Person(2L, "Alex", "alex@mail.com"),
            new Person(3L, "Malik", "mali@mail.com")
    ));

    @RequestMapping(value = "/api/person", method = RequestMethod.GET)
    public List<Person> findAll(){
        return personList;
    }


}
