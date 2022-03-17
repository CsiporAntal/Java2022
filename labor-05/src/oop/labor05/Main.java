package oop.labor05;

import oop.labor05.models.Course;
import oop.labor05.models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println( readCourse("courses.csv"));
        System.out.println( readStudent("students.csv"));
    }
    public static ArrayList<Course> readCourse(String course) {
        ArrayList<Course> res = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(course))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[]data = line.split(",");
                String data0 = data[0].trim();
                String data1 = data [1].trim();
                String data2 = data [2].trim();
                res.add(new Course(data0,data1,Integer.parseInt(data2)));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static ArrayList<Student> readStudent(String student) {
        ArrayList<Student> res= new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(student))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line.isEmpty()) continue;
                String[]data = line.split(",");
                String data0 = data[0].trim();
                String data1 = data[1].trim();
                String data2 = data[2].trim();
                res.add(new Student(data0,data1,data2));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return res;
    }

}

