package assignments.question_15_18;

public class Question_15_18 {
    public static void main(String[] args) {
        ContactManager contacts = new ContactManager();

        contacts.addContact("ibo", "123");
        contacts.addContact("haso", "145");
        contacts.addContact("alo", "345");

        System.out.println(contacts.searchByName("alo"));
        System.out.println(contacts.searchByPhoneNumber("145"));
        System.out.println(contacts.searchByName("dsd"));
        System.out.println(contacts.searchByPhoneNumber("555"));

    }
}
