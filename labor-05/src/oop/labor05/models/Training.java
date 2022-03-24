package oop.labor05.models;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;

public class Training {
    private final Course course;
    private final Mydate startDate;
    private final Mydate endDate;
    private final double pricePerStudents;
    private ArrayList<Student> enrolledStudents;
    public Training(Course course, Mydate startDate, Mydate endDate,double pricePerStudents){
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudents = pricePerStudents;
        this.enrolledStudents = new ArrayList<>();
    }
    public boolean enroll(Student student){
        for (Student s:enrolledStudents){
            if(s.getID().equals(student.getID())){
                return false;
            }
        }
        enrolledStudents.add(student);
        return true;
    }
    public Student findStudentById(String id){
        for (Student a:enrolledStudents){
            if(a.getID().equals(id)){
                return a;
            }
        }
        return null;
    }
    public Course getCourse() {
        return course;
    }
    public int numEnrolled(){
        return enrolledStudents.size();
    }
    public void printToFile(){
        String ki = String.format("%s_%d%d%d_%d%d%d.csv",this.course.getName(),this.startDate.getYear(),this.startDate.getMonth(),this.startDate.getDay(),this.endDate.getYear(),this.endDate.getMonth(),this.endDate.getDay());
        try(PrintStream out = new PrintStream(ki)) {
            out.println(this);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Training{\n" +
                "course=" + course +
                ",\nstartDate=" + startDate +
                ",\nendDate=" + endDate +
                ",\npricePerStudents=" + pricePerStudents
    );
        sb.append("\n");
        for (Student s:enrolledStudents){
            sb.append(s).append("\n");}

        return sb.toString();
    }
    public void unEnroll(String id){
        for (Student s:enrolledStudents){
            if(s.getID().equals(id)){
                enrolledStudents.remove(s);
                return;
            }
        }
    }
}
