package question_11_02;

public class Person {
    private String name;
    private String address;
    private int phoneNum;
    private String email;

    Person(){

    }

    Person(String name, String address, int phoneNum, String email){
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "Name: " + getName() + "\n" +
                "Address: " + getAddress() + "\n" +
                "Phone number: " + getPhoneNum() + "\n" +
                "Email address: " + getEmail();
    }
}
