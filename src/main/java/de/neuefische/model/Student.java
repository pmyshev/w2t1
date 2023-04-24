package de.neuefische.model;

import java.util.Objects;

public class Student {
    private static int df = 100;
    String name;
    int id;
    private int age;

//    private enum gender {
//        m, f
//    }

    private char gender;
    private int yearOfAdmission;

    public Student(String name, int age, char gender){
        this.name = name;
//        this.id = 0;
        this.id = inxPlus();
        this.age = age;
        this.gender = gender;
    }

    public Student(){

    }

    public int inxPlus(){
       return this.df += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public char getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getId() == student.getId() && getAge() == student.getAge() && getGender() == student.getGender() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getAge(), getGender());
    }
}
