package ru.maxima.apring_security.springsecurityapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.maxima.apring_security.springsecurityapp.models.Person;
import ru.maxima.apring_security.springsecurityapp.repositories.PeopleRepository;

import java.util.Optional;

@Service
public class PersonDetailsService implements UserDetailsService{

    private final PeopleRepository peopleRepository;

    @Autowired
    public PersonDetailsService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Optional<Person> byPerson = peopleRepository.findByName(name);
        if (byPerson.isEmpty()) {
            throw new UsernameNotFoundException("User from service class is not found");
        }
        return new PersonDetails(byPerson.get());
    }
}
