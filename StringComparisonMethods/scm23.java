import java.util.Scanner;
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int c=(int) Math.floor(Math.sqrt(B)) - (int) Math.ceil(Math.sqrt(A))+1;
        if(c<0) c=0;
        
   
        System.out.println(c);
    }
    
}