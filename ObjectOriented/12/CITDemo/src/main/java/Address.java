/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmn2
 */
public class Address {
  private int homeNumber;
  private String street;
  private String city;
  
  public Address()
  {
  }
  
  public Address(int homeNumber, String street, String city)
  {
    this.homeNumber = homeNumber;
    this.street = street;
    this.city = city;
  }
  
  public void setAll(int homeNumber, String street, String city)
  {
    this.homeNumber = homeNumber;
    this.street = street;
    this.city = city;
  }
  
  public void print()
  {
    System.out.println("\nHome# " + homeNumber + "\nStreet: " + street + "\nCity: " + city);
  }
  
  public String getAll()
  {
    return toString();
  }

  public String getCity() {
    return city;
  }

  public int getHomeNumber() {
    return homeNumber;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setHomeNumber(int homeNumber) {
    this.homeNumber = homeNumber;
  }
  
  @Override
  public String toString()
  {
    return "\nHome# " + homeNumber + "\nStreet: " + street + "\nCity: " + city;
  }
}
