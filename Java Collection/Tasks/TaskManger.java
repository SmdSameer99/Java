package Tasks;

import java.util.LinkedList;

public class TaskManger {
    
    public static void main(String[] args) {
        
        System.out.println("Task Manager");

        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Task 1: Complete the report");
        tasks.add("Task 2: Attend the meeting");
        tasks.add("Task 3: Review the code");


        tasks.poll(); // Remove the first task
        
        System.out.println("Current Tasks:");
        for (String task : tasks) {
            System.out.println(task);
        }

    }
}
