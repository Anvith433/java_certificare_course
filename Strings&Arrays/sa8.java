import java.util.*;
import java.math.BigInteger;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         BigInteger prod=BigInteger.ONE;
        while(sc.hasNextInt())
        {
            prod=prod.multiply(BigInteger.valueOf(sc.nextInt()));
        }
       
        System.out.println(prod);
        
    }
}