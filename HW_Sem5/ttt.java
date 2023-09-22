package HW_Sem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ttt {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        addContact("Petrov", "123-456-7890", phoneBook);
        addContact("Ivanov", "222-333-4444", phoneBook);
        addContact("Ivanov", "555-654-3210", phoneBook);

        for (Map.Entry<String, ArrayList<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void addContact(String name, String phone, HashMap <String, ArrayList<String>> phoneBook) {
        ArrayList<String> phones = phoneBook.get(name);
        if (phones == null) {
            phones = new ArrayList<>();
            phoneBook.put(name, phones);
        }
        phones.add(phone);
    }
}

//Petrov: [123-456-7890]
//Ivanov: [222-333-4444, 555-654-3210]
