/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmn2
 */
public class Person {
  private String fname;
  private String lname;
  private String cob;
  private Date dob;
  
  public Person()
  {
  }
  
  public Person(String fname, String lname, String cob, Date dob)
  {
    this.cob = cob;
    this.fname = fname;
    this.lname = lname;
    this.dob = dob;
  }
  
  public void setAll(String fname, String lname, String cob, Date dob)
  {
    this.cob = cob;
    this.fname = fname;
    this.lname = lname;
    this.dob = dob;
  }
  
  public void print()
  {
    System.out.println("\nFirst Name: " + fname + "\nLast Name: " + lname + "\nCity of Birth: " + cob + "\nDate of birth: " + dob);
  }
  
  public String getAll()
  {
    return toString();
  }

  public String getCob() {
    return cob;
  }

  public Date getDob() {
    return dob;
  }

  public String getFname() {
    return fname;
  }

  public String getLname() {
    return lname;
  }

  public void setCob(String cob) {
    this.cob = cob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }
  
  @Override
  public String toString()
  {
    return "\nFirst Name: " + fname + "\nLast Name: " + lname + "\nCity of Birth: " + cob + "\nDate of birth: " + dob + "\n------\n";
  }
}
