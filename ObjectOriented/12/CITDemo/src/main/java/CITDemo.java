
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
public class CITDemo {
  ArrayList<Student> students;
  ArrayList<Faculty> facultyMembers;
  ArrayList<Course> courses;

  public CITDemo() {
    students = new ArrayList<Student>();
    facultyMembers = new ArrayList<Faculty>();
    courses = new ArrayList<Course>();
  }

  public CITDemo(ArrayList<Student> students, ArrayList<Faculty> facultyMembers, ArrayList<Course> courses) {
    this.students = students;
    this.facultyMembers = facultyMembers;
    this.courses = courses;
  }

  public ArrayList<Course> getCourses() {
    return courses;
  }

  public ArrayList<Faculty> getFacultyMembers() {
    return facultyMembers;
  }

  public ArrayList<Student> getStudents() {
    return students;
  }
}
