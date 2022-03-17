package oop.labor05.models;

import java.io.IOException;
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

    }
    @Override
    public String toString() {
        return "Training{" +
                "course=" + course +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", pricePerStudents=" + pricePerStudents +
                ", enrolledStudents=" + enrolledStudents +
                '}';
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
