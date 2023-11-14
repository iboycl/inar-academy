package question_11_02;

import week_11.assignments.question_10_14.MyDate;

import java.util.Date;

public class Employee extends Person {
    private String office;
    private int salary;

    private MyDate hiredDate;

    Employee(){
        hiredDate = new MyDate();
    }

    Employee(String office, int salary){
        hiredDate = new MyDate();
        this.office = office;
        this.salary = salary;
    }

    Employee(String name, String address, int phoneNum, String email, String office, int salary){
        super.setName(name);
        super.setAddress(address);
        super.setPhoneNum(phoneNum);
        super.setEmail(email);
        hiredDate = new MyDate();
        this.office = office;
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public MyDate getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(MyDate hiredDate) {
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Office: " + getOffice() + "\n" +
                "Salary: " + getSalary() + "\n" +
                "Hired Date: " + getHiredDate();
    }
}
