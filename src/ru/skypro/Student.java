package ru.skypro;

import java.util.Objects;

public class Student {
    private int age;
    private String name;

    // здесь будет конструктор, геттеры, сеттеры

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return age == student.age && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
