package com.example.Dia3.Repository;

import com.example.Dia3.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>{
} // Inyectando JPA como una interface