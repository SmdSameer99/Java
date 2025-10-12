import java.util.ArrayList;

public class Task_2_ListOfStudents_SortMarks {

    public static class Student {
        String name;
        Integer marks;

        Student(String name, Integer marks) {
            this.name = name;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public Integer getMarks() {
            return marks;
        }

        @Override
        public String toString() {
            return name + ": " + marks;
        }
    }
    
    public static void main(String[] args) {
        
        ArrayList<String> students = new ArrayList<>();

        students.add("Alice", 85);
        students.add("Bob", 92);
        students.add("Charlie", 78);
        students.add("Diana", 90);

        // Sort students by marks in descending order
        students.sort((s1, s2) -> s2.getValue().compareTo(s1.getValue()));

        System.out.println("Students sorted by marks (highest to lowest):");
        for (String student : students) {
            System.out.println(student);
        }

    }
}
