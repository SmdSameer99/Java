// ComparableDemo.java
// Demonstrates Comparable interface
import java.util.*;
class Student implements Comparable<Student> {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public int compareTo(Student s) {
        return this.marks - s.marks; // Ascending order
    }
    public String toString() {
        return name + ": " + marks;
    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 90));
        students.add(new Student("Bob", 80));
        Collections.sort(students);
        System.out.println("Sorted with Comparable: " + students);
    }
}
