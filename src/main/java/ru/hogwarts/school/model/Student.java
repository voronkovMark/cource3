package ru.hogwarts.school.model;


import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Student {

    @javax.persistence.Id
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int age;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="faculty_id")
    private Faculty faculty;

    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student() {

    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }


    public void setId(Long id) {
        this.id = id;
    }


}
