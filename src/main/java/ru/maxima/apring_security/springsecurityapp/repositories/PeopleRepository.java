package ru.maxima.apring_security.springsecurityapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.maxima.apring_security.springsecurityapp.models.Person;

import java.util.Optional;
@Repository
public interface PeopleRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByName(String name);
}
