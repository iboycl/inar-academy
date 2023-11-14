package question_11_02;

public class Faculty extends Employee{
    private String officeHours;

    private String rank;

    Faculty(){

    }

    Faculty(String officeHours, String rank){
        this.officeHours = officeHours;
        this.rank = rank;
    }

    Faculty(String name, String address, int phoneNum, String email, String office, int salary, String officeHours, String rank){
        super.setName(name);
        super.setAddress(address);
        super.setPhoneNum(phoneNum);
        super.setEmail(email);
        super.setOffice(office);
        super.setSalary(salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Office hours: " + getOfficeHours() + "\n" +
                "Rank: " + getRank();
    }
}
