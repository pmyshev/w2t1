package de.neuefische;

import de.neuefische.model.Student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Car myCar = new Car();
//
//        myCar.setBrand("Mercedes-Benz");
//        myCar.year = 2014;
//        myCar.price = 80000.00;
//        myCar.hasFourWheels = true;

        Student anton = new Student("Anton", 19, 'm');
        Student anton_fake = new Student("Michael",21, 'm');


        StudentDB students = new StudentDB(new Student[]{anton, anton_fake});
        int [] x = new int[] {1,2};


        System.out.println(students);
        System.out.println(students.getAllStudents());
        System.out.println(students.randomStudent());

        Student sophia = new Student("Sophia", 19, 'f');
        students.add(sophia);

        System.out.println(students);

        students.remove(102);

        System.out.println(students);


//        System.out.println(anton.getAge());
//        System.out.println(anton.getGender());
//        System.out.println(anton.getYearOfAdmission());

//        System.out.println(myCar.getBrand());



    }

}