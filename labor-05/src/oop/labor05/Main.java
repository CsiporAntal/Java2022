package oop.labor05;

import oop.labor05.models.Course;
import oop.labor05.models.Mydate;
import oop.labor05.models.Student;
import oop.labor05.models.Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println( readCourse("courses.csv"));
        System.out.println( readStudent("students.csv"));
        ArrayList<Course> courses = readCourse("courses.csv");
        ArrayList<Student> students = readStudent("students.csv");
        for (Course c:courses){
            Training t= new Training(c,new Mydate(2003,3,10),new Mydate(2003, 3,10),200);
           // t.enroll(students.get(1));
           // t.enroll(students.get(2));
            for (int i=0;i<students.size();++i){
                t.enroll(students.get(i));
                //RandomGenerator
            }
            Collections.shuffle(students);
            t.printToFile();
        }


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

