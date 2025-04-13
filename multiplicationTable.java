public class multiplicationTable {

    static void printTable(int n, Integer... val)  {
        int i = 1;
      if (val.length != 0)
          i = val[0];
      if (i == 11) // base case
          return;
      System.out.println(n + " * " + i + " = " + n * i);
      i++; 
      printTable(n, i);
  }



    public static void main(String[] args) {
        int number = 5;

        for(int i=1; i<=10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        System.out.println("Using recursion:");
        printTable(number);
    }
}
