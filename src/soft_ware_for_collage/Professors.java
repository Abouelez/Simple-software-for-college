/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft_ware_for_collage;

/**
 *
 * @author Abouelez
 */
import java.util.ArrayList;
public class Professors {
    private String fristName;
    private String lastName;
    private String tel;
    private String address;
    private double salary;
    private ArrayList<Courses>courses = new ArrayList<Courses>();
    private int coursesCnt = 0;

    public Professors() {
    }

    public Professors(String fristName, String lastName, String tel, String address, double salary) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.tel = tel;
        this.address = address;
        this.salary = salary;
    }
    
    public void addCourse(Courses c){
        courses.add(c);
        coursesCnt++;
    }
    
    public String getFullName(){
        return fristName + " " + lastName;
    }

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTel() {
        return tel;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getRais(double ratio){
        salary += salary * ratio;
        return salary;
    }
    public void report(){
        System.out.println("Salary: " + getSalary());
        System.out.print("Courses : ");
        for(int i = 0; i < courses.size(); i++)
            System.out.print(courses.get(i).getName() + " ");
        System.out.println("Telephone: "+ getTel() + "\n Address: " + getAddress());
    }
   
}
