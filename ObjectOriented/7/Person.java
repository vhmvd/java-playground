/**
 * Person
 */
public class Person {

  private String name;
  private int age;
  private char gender;

  Person()
  {
    this.age = -1;
    this.name = "";
    this.gender = 'U';
  }

  Person(String name, int age, char gender)
  {
    this.age = age;
    this.name = name;
    this.gender = gender;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return this.name;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public int getAge()
  {
    return this.age;
  }

  public void setGender(char gender)
  {
    this.gender = gender;
  }

  public char getGender()
  {
    return this.gender;
  }

  public String toString()
  {
    return "\nName: " + this.name + "\nAge: " + this.age + "\nGender: " + this.gender;
  }

}