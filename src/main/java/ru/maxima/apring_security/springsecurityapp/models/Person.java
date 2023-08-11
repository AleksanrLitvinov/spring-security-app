package ru.maxima.apring_security.springsecurityapp.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "security_person")
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Name should not to be empty")
    @Size(min = 2, max = 50, message = "Lenght of name should be min 2 symbols, max 50 symbols")
    @Column(name = "name")
    private String name;

    @Min(value = 0, message = "Age should be min 0 year")
    @Column(name = "age")
    private int age;

    @NotEmpty(message = "password should not to be empty")
    @Email(message = "password should be valid")
    @Column(name = "password")
    private String password;

    public Person(Long id, String name, int age, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.password = password;
    }
    public Person() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}