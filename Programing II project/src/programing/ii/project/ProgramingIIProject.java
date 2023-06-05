package programing.ii.project;
import java.util.ArrayList;
import java.util.Scanner;

class University{
String name;
ArrayList<Student> students;
ArrayList<Teacher> teachers;
static int earnedMoney = 0, spentMoney = 0;
public void University() { System.out.println("Welcom To SPU");}
 static void totalMoneyEarned(int money) {
        earnedMoney += money;
    }

    static void totalMoneySpent(int money) {
        spentMoney += money;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public static int getEarnedMoney() {
        return earnedMoney;
    }

    public static void setEarnedMoney(int earnedMoney) {
        University.earnedMoney = earnedMoney;
    }

    public static int getSpentMoney() {
        return spentMoney;
    }

    public static void setSpentMoney(int spentMoney) {
        University.spentMoney = spentMoney;
    }

    int theBenfit(){
        return earnedMoney-spentMoney;
    }

    void addStudent(Student newStudent){
        students.add(newStudent);
    }

    void removeStudent(Student newStudent){
        students.remove(newStudent);
    }

    void allStudents(){
        for(Student st : students){
            System.out.println("\nid:"+st.id+"\nname:"+st.name+"\ntotal fees:"+st.totalfees+"\npaid fees:"+st.paidfees);
        }
    }

    void addTeacher(Teacher newTeacher){
        teachers.add(newTeacher);
    }

    void removeTeacher(Teacher newTeacher){
        teachers.remove(newTeacher);
    }
    void allTeachers(){
        for(Teacher st : teachers){
            System.out.println("\nid:"+st.id+"\nname:"+st.name+"\nhoures per month:"+st.hourspermonth+"\nsalary:"+st.salary);
        }
    }
}


class Person{
public int id;
public String name;
public void set(int id,String name){
this.id=id;
this.name=name;}
public int getid(){return id;}
public String getname(){return name;}
}

class Teacher extends Person{
public double salary;
public int hourspermonth;
public void Teacher(){}
public void set(double salary , int hourspermonth){
this.salary=salary;
this.hourspermonth = hourspermonth;}
public double getsalary(){return salary;}
public int getHPM(){return hourspermonth;}
public void recievsalary(double salary){this.salary+=salary;}
public void added_salary_teacher(){
if(hourspermonth <= 20){
salary+=salary*0.20;} 
}
}

class Student extends Person{
public double GPA;
public double totalfees;
public double paidfees;
public void Student(){}
public void set(double GPA,double totalfees,double paidfees){
this.GPA=GPA;
this.totalfees=totalfees;
this.paidfees=paidfees;}
public double getGPA(){return GPA;}
public double gettotalbills(){return totalfees;}
public double getpaidbills(){return paidfees;}
public void update_efees(double fees){totalfees+=fees;}
public void paidfees(double paidfees){this.paidfees+=paidfees;}
public double remain_fees(){
System.out.println("remain fees = ");
if(GPA <= 70){
totalfees -= totalfees *0.30;}
return totalfees-paidfees;}
}

public class ProgramingIIProject {
public static void main(String[] args) {
University uni = new University();
uni.name="SPU";

    
}}
