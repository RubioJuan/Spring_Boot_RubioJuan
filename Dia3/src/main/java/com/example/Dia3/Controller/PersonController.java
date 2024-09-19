package com.example.Dia3.Controller;

import com.example.Dia3.Service.PersonService;
import com.example.Dia3.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    // Obtener a todas las personas
    // localhost:8080/api/person
    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    //Obtener a una persona por ID
    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id){
        return personService.getPersonById(id).orElseThrow();
    }

    //Crear una Persona
    //localhost:8080/api/person con verbo POST
    //{
    //"name":"Andres",
    //"age":25
    //}
    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

    // Actualizar a una Persona
    //localhost:8080/api/person/1 con verbo PUT
    //{
    //"name":"Pastrana",
    //"age":28
    //}
    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Long id, @RequestBody Person person){
        return personService.updatePerson(id, person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
    }
}