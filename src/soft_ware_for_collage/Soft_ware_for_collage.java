/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft_ware_for_collage;

import java.util.Scanner;

/**
 *
 * @author Abouelez
 */
public class Soft_ware_for_collage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        Scanner input5 = new Scanner(System.in);
        Scanner input6 = new Scanner(System.in);

        Collage collage = new Collage();
        String choice;
        System.out.println("Welcom to our university! \n" + "Operation: \n" + 
                    "1- Collage: \n" + "a) Number of Departments \n" + "b) Number of Courses \n" + 
                    "c) Number of Professors \n" + "d) Number of Students \n" + "e) Report \n" + "=====" +
                    "\n2- Department \n" + "a) New \n" + "b) Number of Courses \n" + "c) Number of Students \n"+
                    "d) Is Full \n" + "e) Enroll \n" + "f) Report \n" + "===== \n" + 
                    "3- Course \n" + "a) New \n" + "b) Number of Students \n" + "c) Assign \n" + "d) Is assigned\n"+
                    "e) Professor Name \n" + "f) Is Full \n" + "g) Enroll \n" + "h) Report \n" + "===== \n" + 
                    "4- Professor \n" + "a) New \n" + "b) Display Salary \n" + "c) Get Raise \n" + "d) Report\n"+"===== \n"+
                    "5- Student \n" + "a) New \n" + "b) Report \n" + "========== \n" + 
                    "6- Quit" );
        while(true){
            System.out.println("============================"+ "\n Enter Operation \n" + "============================");
            choice = input1.nextLine();
            if(choice.equals("1a"))
                System.out.println(collage.getDepartmentsCnt());
            else if(choice.equals("1b"))
                System.out.println(collage.getCoursesCnt());
            else if(choice.equals("1c"))
                System.out.println(collage.getProfessorsCnt());
            else if(choice.equals("1d"))
                System.out.println(collage.getStudentsCnt());
            else if(choice.equals("1e"))
                collage.report();
       
//////////////////////////////////////////////////////
            else if(choice.equals("2a"))
                collage.addDepartment();
            else if(choice.equals("2b")){
                String name;
                System.out.println("Department: ");
                name = input2.nextLine();
                Departments d = collage.findDepartment(name);
                System.out.println(d.getNumberOfCourses());
            }                
            else if(choice.equals("2c")){
                String name;
                System.out.println("Department: ");
                name = input2.nextLine();
                Departments d = collage.findDepartment(name);
                System.out.println(d.getNumberOfStudents());
            }
            else if(choice.equals("2d")){
                String name;
                System.out.println("Department: ");
                name = input2.nextLine();
                Departments d = collage.findDepartment(name);
                if( d.isFull() )
                    System.out.println("Department Is Full");
                else
                    System.out.println("Departmeent Is not Full");
            }
            else if(choice.equals("2e")){
                System.out.println("Department: ");
                String dpartmentName =  input2.nextLine();
                Departments d = collage.findDepartment(dpartmentName);
                if(d.isFull())
                    System.out.println("False");
                else{
                    System.out.println("Student: ");
                    String studentName = input2.nextLine();

                    Students s = collage.findStudent(studentName);
                    d.enroll(s);      
                }
            }
            else if(choice.equals("2f")){
                System.out.println("Department: ");
                String name = input2.nextLine();
                Departments d = collage.findDepartment(name);
                d.report();
            }
/////////////////////////////////////////////////////////
            
            else if(choice.equals("3a"))
                collage.addCourses();
         
            else if(choice.equals("3b")){
                System.out.println("Course: ");
                String name = input3.nextLine();
                Courses s = collage.findCourse(name);
                System.out.println(s.getNumberOfStudents());
            }
            else if(choice.equals("3c")){
                System.out.println("Course: ");
                String name = input3.nextLine();
                Courses s = collage.findCourse(name);
                System.out.println("Professor: ");
                String prof = input3.nextLine();
                Professors p = collage.findProfessor(prof);
                s.assignProfessor(p);
                p.addCourse(s);
            }
            else if(choice.equals("3d")){
                System.out.println("Course: ");
                String name = input3.nextLine();
                Courses s = collage.findCourse(name);
                if(s.isAssigned())
                    System.out.println("Assigned");
                else
                    System.out.println("Not Assigned");
            }
            else if(choice.equals("3e")){
                System.out.println("Course: ");
                String name = input3.nextLine();
                Courses s = collage.findCourse(name);
                System.out.println(s.professorName());
            }
            else if(choice.equals("3f")){
                System.out.println("Course: ");
                String name = input3.nextLine();
                Courses s = collage.findCourse(name);
                if(s.isFull())
                    System.out.println("Is Full");
                else
                    System.out.println("Not Full");
            }
            else if(choice.equals("3g")){
                System.out.println("Course: ");
                String name = input3.nextLine();
                Courses s = collage.findCourse(name);
                System.out.println("Student: ");
                String studName = input3.nextLine();
                Students st = collage.findStudent(studName);
                s.enroll(st);
                st.addCourse(s);
            }
            else if (choice.equals("3h")){
                System.out.println("Course: ");
                String name = input3.nextLine();
                Courses s = collage.findCourse(name);
                s.report();
            }
            
            else if(choice.equals("4a"))
                collage.addProfessor();
            else if(choice.equals("4b")){
                System.out.println("Professor: ");
                String prof = input4.nextLine();   
                Professors p = collage.findProfessor(prof);
                System.out.println(p.getSalary());
            }
            else if (choice.equals("4c")){
                System.out.println("Professor: ");
                String prof = input4.nextLine();   
                Professors p = collage.findProfessor(prof);
                System.out.println("ratio: ");
                double ratio = input4.nextDouble();
                p.getRais(ratio);
                System.out.println("Salary: " + p.getSalary());
            }
            else if (choice.equals("4d")){
                System.out.println("Professor: ");
                String prof = input6.nextLine();   
                Professors p = collage.findProfessor(prof);
                p.report();
            }
///////////////////////////////////////////////////
            else if(choice.equals("5a"))
                collage.addStudent();
            else if(choice.equals("5b")){
                System.out.println("student: ");
                String name = input5.nextLine();
                Students s = collage.findStudent(name);
                s.report();
            }
            
            else if (choice.equals("6"))
                break;
            else
                System.out.println("Invalid Choice");
        }
    }
        
}
