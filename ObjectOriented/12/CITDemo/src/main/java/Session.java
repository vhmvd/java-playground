/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmn2
 */
public class Session {
  private String sessionName;
  private int sessionYear;
  
  public Session()
  {
    
  }
  
  public Session(String sessionName, int sessionYear)
  {
    this.sessionName = sessionName;
    this.sessionYear = sessionYear;
  }
  
  public void setAll(String sessionName, int sessionYear)
  {
    this.sessionName = sessionName;
    this.sessionYear = sessionYear;
  }
  
  public void print()
  {
    System.out.println("\nSession Name: " + sessionName + "\nSession Year: " + sessionYear);
  }
  
  public String getAll()
  {
    return toString();
  }

  public String getSessionName() {
    return sessionName;
  }

  public int getSessionYear() {
    return sessionYear;
  }

  public void setSessionName(String sessionName) {
    this.sessionName = sessionName;
  }

  public void setSessionYear(int sessionYear) {
    this.sessionYear = sessionYear;
  }
  
  @Override
  public String toString()
  {
    return "\nSession Name: " + sessionName + "\nSession Year: " + sessionYear;
  }
}
