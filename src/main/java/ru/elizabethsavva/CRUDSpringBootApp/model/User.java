package ru.elizabethsavva.CRUDSpringBootApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "profession")
    private String profession;
    @Column(name = "age")
    private int age;

    public User() {

    }

    public User(String name, String profession, int age) {
        this.name = name;
        this.profession = profession;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", age=" + age +
                '}';
    }
}