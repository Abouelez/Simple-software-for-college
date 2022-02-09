/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft_ware_for_collage;
import java.util.ArrayList;
/**
 *
 * @author Abouelez
 */
public class Courses {
    private String name;
    private String description;
    private int maxNumberOfStudents;
    private int numberOfLec;
    private ArrayList<Students> students = new ArrayList<Students>();
    private Professors professor;
    private Departments department;
    private int studentsCnt = 0;

    public Courses() {
    }

    public Courses(String name, String description, int maxNumberOfStudents, int numberOfLec, Departments department) {
        this.name = name;
        this.description = description;
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.numberOfLec = numberOfLec;
        this.department = department;
        
    }

    public Courses(String name, String description, int maxNumberOfStudents, int numberOfLec, Professors professor, Departments department) {
        this.name = name;
        this.description = description;
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.numberOfLec = numberOfLec;
        this.professor = professor;
        this.department = department;
    }
    
    
    public int getNumberOfStudents(){
        return studentsCnt;
    }
    public boolean assignProfessor(Professors p){
        if(this.professor == null){
            this.professor = p;
            return true;
        }
        return false;
    }
    
    public boolean isAssigned(){
        if(this.professor != null)
            return true;
        else
            return false;
    }
    
    public String professorName(){
        return professor.getFullName();
    }
    
    public boolean isFull(){
        return studentsCnt == maxNumberOfStudents;
    }
    
    public boolean enroll(Students students){
        if(students.getDepartment().getName() == this.getDepartment().getName() && studentsCnt < maxNumberOfStudents){
            this.students.add(students);
            students.addCourse(this);
            studentsCnt++;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfLec() {
        return numberOfLec;
    }

    public Departments getDepartment() {
        return department;
    }

    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMaxNumberOfStudents(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public void setNumberOfLec(int numberOfLec) {
        this.numberOfLec = numberOfLec;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }
    
    public void report(){
        System.out.println("Description: " + description + "\n Department: " + getDepartment().getName() + "\n Lectures: " + getNumberOfLec()
                  + "\n Max Students: " + getMaxNumberOfStudents() + "\n Students: " + getNumberOfStudents());
        if(isFull())
            System.out.println("Full");
        else
            System.out.println("Full");
        System.out.println("Professor: " + professorName());
    }
    
    
}

