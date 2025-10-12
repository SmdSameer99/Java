import java.util.ArrayList;

public class GPT_Task_1_ListOfStudents {
    

    public static void main(String[] args) {
        
        // Create an array of student names in collection
        ArrayList<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Diana");

        // Print the list of students
        System.out.println("List of Students:");
        for (String student : students) {
            System.out.println(student);
        }
        students.remove("Charlie");

        System.out.println("After removing Charlie:");
        for (String student : students) {
            System.out.println(student);
        }   

        //checing if a student is in the list
        System.out.println("Is Bob in the list? " + students.contains("Bob"));
        System.out.println("Is Charlie in the list? " + students.contains("Charlie"));

        // size of the list
        System.out.println("Total number of students: " + students.size());

    }
}
