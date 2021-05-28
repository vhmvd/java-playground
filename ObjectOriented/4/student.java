import java.util.ArrayList;
import java.util.Arrays;

public class student {
    // Student class contains id, name,gpa and courseGrade parameter
    private String id;
    private String name;
    private double gpa;
    ArrayList<String> coursesGrades = new ArrayList<>(20);

    // Default constructor
    student() {
        id = "";
        name = "";
        gpa = 0.0;
    }

    // Constructor which take id name and array list of courses grades
    student(String id, String name, ArrayList<String> coursesGrades) {
        this.id = id;
        this.name = name;
        this.coursesGrades = coursesGrades;
    }

    // setter method for Id
    public void setId(String id) {
        this.id = id;
    }

    // setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // setter method for courses Grades
    public void setCoursesGrades(ArrayList<String> coursesGrades) {
        this.coursesGrades = coursesGrades;
    }

    // getter mehtod for Id
    public String getId() {
        return id;
    }

    // getter mehtod for name
    public String getName() {
        return name;
    }

    // getter for grades
    public double getGrade(char gradeLetter) {
        if (gradeLetter == 'A') {
            return 4.0;
        } else if (gradeLetter == 'B') {
            return 3.0;
        } else if (gradeLetter == 'C') {
            return 2.0;
        } else if (gradeLetter == 'D') {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    // getter mehtod for gpa
    public double getGpa() {
        double creditHour = 3;

        double gradeObtained = 0;

        // count the number of courses
        int count = 0;

        for (String grade : coursesGrades) {
            gradeObtained += getGrade(grade.charAt(0));
            count++;
        }

        gpa = gradeObtained / (count * creditHour);
        gpa = Math.round(gpa * 100.0) / 100.0;
        return gpa;
    }

    // getter mehtod for courses grades
    public ArrayList<String> getCoursesGrades() {
        return coursesGrades;
    }

    // getter mehtod for joining year
    public String getJoiningYear() {
        return id.substring(0, 4);
    }

    // this function returns the string form of the class
    public String toString() {
        String output = "";
        output += "Id : " + this.id + "\n";
        output += "Name: " + this.name + "\n";
        output += "GPA: " + getGpa() + "\n";
        return output;
    }

    public static void main(String[] args) {
        // here we make a student class object
        // here first 4 digit contains the year of joining of the university
        student student;
        student = new student("202004557", "Mariam", new ArrayList<>(Arrays.asList("A", "B", "A", "C")));
        System.out.println(student);
        System.out.println("Year of joining: " + student.getJoiningYear());
    }

}