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
public class Students {
    private String fristName;
    private String lastName;
    private String tel;
    private String address;
    private int age;
    private Departments department;
    private ArrayList<Courses>courses = new ArrayList<Courses>();
    private int coursesCnt = 0;
    
    
    public Students(){
        
    }

    public Students(String fristName, String lastName, String tel, String address, int age) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.tel = tel;
        this.address = address;
        this.age = age;
        
    }
    
    public void addCourse(Courses s){
        courses.add(s);
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

    public int getAge() {
        return age;
    }

    public Departments getDepartment() {
        return department;
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

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public void report()
    {
        System.out.print("Courses: ");
        for(int i = 0; i < courses.size(); i++)
            System.out.print(courses.get(i).getName()+ " ");
        System.out.println("Telephone" + getTel() + "\n Address: " + getAddress() + "\n Age: " + getAge());
    }    
    
}
