/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft_ware_for_collage;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Abouelez
 */
public class Departments {
    private String name;
    private String discription;
    private int maxNumberOfStudents;
    private ArrayList<Courses>courses = new ArrayList<Courses>();
    private ArrayList<Students>students = new ArrayList<Students>();
    private int studentsCnt = 0;
    private int coursesCnt  = 0;
    Scanner input = new Scanner(System.in);
    public Departments(){
        
    }
    public Departments(String name, String discription, int max){
        this.name                =        name;
        this.discription         = discription;
        this.maxNumberOfStudents =         max;
    }

    public String getName() {
        return name;
    }

    public String getDiscription() {
        return discription;
    }

    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }
    
    public int getNumberOfCourses(){
        return coursesCnt;
    }
    
    public int getNumberOfStudents(){
        return studentsCnt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public void setMaxNumberOfStudents(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }
    
    public void addCourse(Courses s){
        courses.add(s);
        coursesCnt++;
    }
    
    public Courses findCourse(String name){
        for(int i = 0; i < coursesCnt; i++)
            if(courses.get(i).getName().equals(name))
                return courses.get(i);
        return null;
    }
    
    public boolean isFull(){
        if(studentsCnt == maxNumberOfStudents)
            return true;
        else
            return false;
    }
    
    public boolean enroll(Students s){
        if(studentsCnt < maxNumberOfStudents){
            students.add(s);
            s.setDepartment(this);
            studentsCnt++;
            return true;
        }
        return false;
    }
    public void report(){
        System.out.println("Description: " + discription + "\n Max Students: " + maxNumberOfStudents +
                "\n Students: " + studentsCnt);
        if(isFull())
            System.out.println("\n Status: Full");
        else
            System.out.println("\n Status: Not Full");
        System.out.println("\n Courses: " + coursesCnt);
    }
    
}
