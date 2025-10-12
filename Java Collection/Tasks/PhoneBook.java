package Tasks;

import java.util.HashMap;

public class PhoneBook {
    public static void addMember(HashMap<String, Integer> phoneBook) {
        for(int i=0; i<5; i++) {
            phoneBook.put("Name" + i,  i);
        }
    }

    public static void main(String[] args) {
        System.out.println("PhoneBook application");

        HashMap<String, Integer> phoneBook = new HashMap<>();
        addMember(phoneBook);
        System.out.println(phoneBook);

        System.out.println("\nSearch by name: Name3, \n\n Phone number: " + phoneBook.get("Name3"));

        System.out.println("\nSearch by Phone no: 3, \n\n Name: " );
        for (String i : phoneBook.keySet()) {
            if (phoneBook.get(i) == 3) {
                System.out.println(i);
            }
        }
        
        
    }

}
