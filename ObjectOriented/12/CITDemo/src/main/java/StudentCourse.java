/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmn2
 */
public class StudentCourse {
  Course courseInfo;
  Session courseSession;
  private double courseScore;
  private double courseGPA;
  private String status;

  public StudentCourse() {
  }

  public StudentCourse(Course courseInfo, Session courseSession, double courseScore, double courseGPA, String status) {
    this.courseInfo = courseInfo;
    this.courseSession = courseSession;
    this.courseScore = courseScore;
    this.courseGPA = courseGPA;
    this.status = status;
  }

  public void setCourseGPA(double courseGPA) {
    this.courseGPA = courseGPA;
  }

  public void setCourseInfo(Course courseInfo) {
    this.courseInfo = courseInfo;
  }

  public void setCourseScore(double courseScore) {
    this.courseScore = courseScore;
  }

  public void setCourseSession(Session courseSession) {
    this.courseSession = courseSession;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public double getCourseGPA() {
    return courseGPA;
  }

  public Course getCourseInfo() {
    return courseInfo;
  }

  public double getCourseScore() {
    return courseScore;
  }

  public Session getCourseSession() {
    return courseSession;
  }

  public String getStatus() {
    return status;
  }

  @Override
  public String toString() {
    return courseInfo.toString() + courseSession.toString() + "\nCourse Score: " + courseScore + "\nGPA: " + courseGPA + "\nStatus: " + status;
  }  
}
