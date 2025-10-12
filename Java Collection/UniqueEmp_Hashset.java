import java.util.HashSet;

public class UniqueEmp_Hashset {
    
    public static void main(String[] args) {
        
        HashSet<Integer> empId = new HashSet<>();
        
        for(int i=101; i<=110; i++){
            empId.add(i);
        }

        System.out.println("Employee IDs: " + empId);

        // Trying to add duplicate IDs
        empId.add(105);

        System.out.println("After attempting to add duplicate ID 105: " + empId);

        // Check if an ID exists
        System.out.println("Does Employee ID 108 exist? " + empId.contains(108));

        // Remove an ID
        empId.remove(102);
        System.out.println("After removing Employee ID 102: " + empId);

        // Size of the HashSet
        System.out.println("Total unique Employee IDs: " + empId.size());
    }
}
