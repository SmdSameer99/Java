import java.util.HashMap;

public class Country_Captial_Map {
    
    public static void main(String[] args) {
        
        // Create a map to store country-capital pairs
       HashMap<String, String> countryCapitalMap = new java.util.HashMap<>();

        // Adding country-capital pairs to the map
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Germany", "Berlin");
        countryCapitalMap.put("Japan", "Tokyo");

        // Print the map
        System.out.println("Country-Capital Map: " + countryCapitalMap);
        
        // Retrieve the capital of a specific country
        String capitalOfIndia = countryCapitalMap.get("India");
        System.out.println("The capital of India is: " + capitalOfIndia);

        // Check if a country exists in the map
        boolean hasFrance = countryCapitalMap.containsKey("France");
        System.out.println("Does the map contain France? " + hasFrance);

        // Remove a country-capital pair
        countryCapitalMap.remove("Germany");
        System.out.println("After removing Germany: " + countryCapitalMap);

        // Size of the map
        System.out.println("Total number of countries in the map: " + countryCapitalMap.size());
    }
}
