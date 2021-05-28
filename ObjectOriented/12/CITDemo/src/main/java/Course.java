/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmn2
 */
public class Course {

  private String courseID;
  private String courseName;
  private Track courseTrack;
  private int courseCredit;

  public Course() {
  }
  
  public Course(String courseID, String courseName, Track courseTrack, int courseCredit)
  {
    this.courseID = courseID;
    this.courseName = courseName;
    this.courseTrack = courseTrack;
    this.courseCredit = courseCredit;
  }
  
  public void setAll(String courseID, String courseName, Track courseTrack, int courseCredit)
  {
    this.courseID = courseID;
    this.courseName = courseName;
    this.courseTrack = courseTrack;
    this.courseCredit = courseCredit;
  }
  
  public String getAll()
  {
    return toString();
  }

  public int getCourseCredit() {
    return courseCredit;
  }

  public String getCourseID() {
    return courseID;
  }

  public String getCourseName() {
    return courseName;
  }

  public Track getCourseTrack() {
    return courseTrack;
  }

  public void setCourseCredit(int courseCredit) {
    this.courseCredit = courseCredit;
  }

  public void setCourseID(String courseID) {
    this.courseID = courseID;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public void setCourseTrack(Track courseTrack) {
    this.courseTrack = courseTrack;
  }
  
  public void print()
  {
    System.out.println("\nCourse ID: " + courseID + "\nCourse Name: " + courseName + "\nCourse Track: " + courseTrack + "\nCourse Credit: " + courseCredit);
  }
  
  @Override
  public String toString()
  {
    return "\nCourse ID: " + courseID + "\nCourse Name: " + courseName + "\nCourse Track: " + courseTrack + "\nCourse Credit: " + courseCredit + "\n------\n";
  }
}
