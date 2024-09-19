package com.example.Dia3.Service;

import com.example.Dia3.Model.Person;
import com.example.Dia3.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    // Obtener todos las personas
    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    // Obtener una persona por ID
    public Optional<Person>getPersonById(Long id){
        return personRepository.findById(id);
    }

    // Guardar una persona
    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    // Eliminar una persona
    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }

    // Actulizar una persona
    public Person updatePerson(Long id, Person personDetails){
        Person person = personRepository.findById(id).orElseThrow();
        person.setName(personDetails.getName());
        person.setAge(personDetails.getAge());
        return personRepository.save(person);
    }
}