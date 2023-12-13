package assignments.question_15_18;

import java.util.HashMap;
import java.util.Map;

public class ContactManager {
    private Map<String, String> contacts;

    public ContactManager() {
        contacts = new HashMap<>();
    }

    public void addContact (String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public String searchByName (String name) {
        if (contacts.containsKey(name)){
            return contacts.get(name);
        }
        return "This name could not be found!";
    }

    public String searchByPhoneNumber (String phoneNumber) {
        if (contacts.containsValue(phoneNumber)) {
            for (Map.Entry<String, String> entry : contacts.entrySet()){
                if (entry.getValue().equals(phoneNumber)) {
                    return entry.getKey();
                }
            }
        }

        return "This number could not be found!";
    }
}
