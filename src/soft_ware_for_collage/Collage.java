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
public class Collage {
    private ArrayList<Departments> departments = new ArrayList<Departments>();
    private ArrayList<Students> students = new ArrayList<Students>();
    private ArrayList<Professors> professors = new ArrayList<Professors>();
    private ArrayList<Courses> courses = new ArrayList<Courses>();
    private int departmentsCnt = 0;
    private int studentsCnt    = 0;
    private int professorsCnt  = 0;
    private int coursesCnt     = 0;
    
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    Scanner input3 = new Scanner(System.in);
    Scanner input4 = new Scanner(System.in);
    Scanner input5 = new Scanner(System.in);
    public Collage(){
        
    }
    public void addDepartment(){
        System.out.println("Department Name: ");
        String name = input1.nextLine();
        System.out.println("Department Discription: ");
        String discription = input1.nextLine();
        System.out.println("Department Max Students: ");
        int maxStudents = input1.nextInt();
        Departments d = new Departments(name, discription, maxStudents);
        departments.add(d);
        departmentsCnt++;
    }
    
    public void addCourses(){
        System.out.println("Course Name: ");
        String name = input2.nextLine();
        System.out.println("Course Description: ");
        String discription = input2.nextLine();
        System.out.println("Course Max Students:");
        int max = input2.nextInt();
        System.out.println("Course lectures: ");
        int lec = input2.nextInt();
        System.out.println("Department: ");
        String dpartmentName = input5.nextLine();
        Departments d = this.findDepartment(dpartmentName);
        Courses c = new Courses(name, discription, max, lec, d);
        d.addCourse(c);
        courses.add(c);
        coursesCnt++;
    }
    public void addProfessor(){
        System.out.println("Professor frist name: ");
        String fName = input3.nextLine();
        System.out.println("Professor last name");
        String lName = input3.nextLine();
        System.out.println("Professor telephone");
        String tel = input3.nextLine();
        System.out.println("Professor address");
        String address = input3.nextLine();
        System.out.println("Professor salary");
        double salary = input3.nextDouble();
        Professors p = new Professors(fName, lName, tel, address, salary);
        professors.add(p);
        professorsCnt++;
    }
    public void addStudent(){
        System.out.println("Student Firstname:");
        String fName = input4.nextLine();
        System.out.println("Student Lastname:");
        String lName = input4.nextLine();
        System.out.println("Student Telephone: ");
        String tel = input4.nextLine();
        System.out.println("Student Address:");
        String address = input4.nextLine();
        System.out.println("Student Age:");
        int age = input4.nextInt();
        Students s = new  Students(fName, lName, tel, address, age);
        students.add(s);
        studentsCnt++;
    }
        

    public int getDepartmentsCnt() {
        return departmentsCnt;
    }

    public int getStudentsCnt() {
        return studentsCnt;
    }

    public int getProfessorsCnt() {
        return professorsCnt;
    }

    public int getCoursesCnt() {
        return coursesCnt;
    }
    
    public Departments findDepartment(String name){
        for(int i = 0; i < departments.size(); i++)
            if(departments.get(i).getName().equals(name))
                return departments.get(i);
        
        return null;
    }
    
    public Students findStudent(String name){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getFullName().equals(name))
                return students.get(i);
        }
        return null;
    }
    
    public Professors findProfessor(String name){
        for(int i = 0; i < professorsCnt; i++){
            if(professors.get(i).getFullName().equals(name))
                return professors.get(i);
        }
        return null;
    }
    
    public Courses findCourse (String name){
        for(int i = 0; i < courses.size(); i++){
            if(courses.get(i).getName().equals(name))
                return courses.get(i);
        }
        return null;
    }
    
    public void report(){
        System.out.println(professorsCnt + "Professors \n" + studentsCnt + "Students \n"
                           + coursesCnt + "Courses \n" + departmentsCnt + "departments");
    }

}