package de.neuefische;

import de.neuefische.model.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentDB {
    ArrayList<Student> st;
    Student[] students;

    public StudentDB (Student[] students){
//        this.students = new Student[arraySize];
        this.students = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            this.students[i] = students[i];
        }
    }

    public Student[] getAllStudents(){
        return this.students;
    }

    @Override
    public String toString() {
        return "StudentDB Beispiel{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

    public Student randomStudent(){
        int randomStudentInx = (int) (Math.random() * this.students.length);
        return students[randomStudentInx];
    }

    public void add (Student student){
        Student[] newStudents = new Student[students.length + 1];
        int newStudentInx = this.students.length;

//       Studenten aus der alten Liste kopieren
        for (int i = 0; i < this.students.length; i++) {
            newStudents[i] = this.students[i];
        }

        newStudents[newStudentInx] = student;
        this.students = newStudents;
    }

    public void remove (int studentId){
        int StudentInx = -1;
        int newArrayIdx = 0;
        Student[] newStudents = new Student[students.length -1];

        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == studentId){
                StudentInx = i;
            }
        }

        if (StudentInx >= 0){
            for (int i = 0; i < this.students.length; i++) {
                if (i == StudentInx){
                    continue;
                }
                newStudents[newArrayIdx] = this.students[i];
                newArrayIdx++;
            }

        }

        this.students = newStudents;
    }
}
