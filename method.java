public class method {
    private String name;
    private String returnType;

    public method(String name, String returnType) {
        this.name = name;
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public String getReturnType() {
        return returnType;
    }

    public static void main(String[] args) {
        method method = new method("calculate", "int");
        System.out.println("Method Name: " + method.getName());
        System.out.println("Return Type: " + method.getReturnType());
        
    }
}   
/*
 * Differnt way to creat a method in java
 * 1. Using instance method
 * 2. Using static method
 */

 