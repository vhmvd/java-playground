
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ahmn2
 */
public class Faculty {

  private Person member;
  private ArrayList<Course> courses;

  public Faculty() {
  }

  public Faculty(Person member) {
    this.member = member;
    courses = new ArrayList<>();
  }

  public void setCourses(Course course) {
    courses.add(course);
  }

  public void setMember(Person member) {
    this.member = member;
  }

  public void getCourses() {
    for (Iterator<Course> it = courses.iterator(); it.hasNext();) {
      Course itr = it.next();
      System.out.println(itr);
    }
  }

  public Person getMember() {
    return member;
  }
  
  @Override
  public String toString() {
    return member.toString() + "------\n";
  }

}
