
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmn2
 */
public class Student {
  private String studentID;
  private Person student;
  private Address address;
  private ArrayList<StudentCourse> studentCourses;

  public Student() {
  }

  public Student(String studentID, Person student, Address address) {
    this.studentID = studentID;
    this.student = student;
    this.address = address;
    this.studentCourses = new ArrayList<>();
  }

  public Address getAddress() {
    return address;
  }

  public Person getStudent() {
    return student;
  }

  public ArrayList<StudentCourse> getStudentCourses() {
    return studentCourses;
  }

  public String getStudentID() {
    return studentID;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public void setStudent(Person student) {
    this.student = student;
  }

  /**
   * 
   * @param studentID 
   */
  public void setStudentID(String studentID) {
    this.studentID = studentID;
  }
  
  public void addStudentCourses(StudentCourse course) {
    studentCourses.add(course);
  }
  
  public String toString()
  {
    return "Student ID: " + studentID + student.toString() + address.toString() + "\n------\n";
  }
}
