import java.util.*;
class Main {

    static String fizzbuzz(int num) {
         if((Math.abs(num))%3==0 && (Math.abs(num))%5==0)
        {
            return "FizzBuzz";
        }

        else if((Math.abs(num))%3==0)
        {
            return "Fizz";
        }
        else if((Math.abs(num))%5==0)
        {
            return "Buzz";
        }
    
        
        else {
            return Integer.toString(num);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        System.out.println(fizzbuzz(temp));

        sc.close();
    }

}