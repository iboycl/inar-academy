package question_11_02;

public class Staff extends Employee{

    private String title;

    Staff(){

    }

    Staff(String title){
        this.title = title;
    }

    Staff(String name, String address, int phoneNum, String email, String office, int salary, String title){
        super.setName(name);
        super.setAddress(address);
        super.setPhoneNum(phoneNum);
        super.setEmail(email);
        super.setOffice(office);
        super.setSalary(salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Title: " + getTitle();
    }
}
