package question_11_02;

public class Student extends Person{
    private String status;

    Student(){
        status = "Undefined";
    }

    Student(int status){
        this.setStatus(status);
    }

    Student(String name, String address, int phoneNum, String email, int status){
        super.setName(name);
        super.setAddress(address);
        super.setPhoneNum(phoneNum);
        super.setEmail(email);
        this.setStatus(status);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(int status) {
        switch (status) {
            case 0 -> this.status = "freshman";
            case 1 -> this.status = "sophomore";
            case 2 -> this.status = "junior";
            case 3 -> this.status = "senior";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Class Status: " + getStatus();
    }
}
