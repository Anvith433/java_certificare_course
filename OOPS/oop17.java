import java.util.Scanner;

/**
* Interface Addition should have the following abstract method.
* 
* Abstract Method
* - add
* 
* Interface Subtraction should have the following abstract methods.
* 
* Abstract Method
* - subtract
*
* Interface Multiplication should have the following abstract methods.
* - multiply
*
* Class Calculator should implement all the above interfaces
* It should have the following methods
* 
* Methods
* - add
*   Takes two integers as input and return their sum
* - subtract 
*   Take two integers as input and return their difference
* - multiply
*   Take two integers as input and return their product
* 
* Implement the interfaces and classes accordingly 
*/


interface Addition {
    int add(int m,int n);
}

interface Subtraction {
    int subtract(int p,int q);
}
interface Multiplication {
   int multiply(int s,int t);
}

class Calculator implements Addition,Subtraction,Multiplication{
  public int add(int m,int n)
  {
      return m+n;
  }
  public int subtract(int p,int q)
  {
      return p-q;
  }
  public int multiply(int s,int t)
  {
      return s*t;
  }
}

class Action {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(input.nextInt(), input.nextInt())); // takes 2, 3 as input and returns 5
        System.out.println(calculator.subtract(input.nextInt(), input.nextInt())); // takes 5, 4 as input and returns 1
        System.out.println(calculator.multiply(input.nextInt(), input.nextInt())); // takes 6, 7 as input and returns 42
        input.close();
    }
}