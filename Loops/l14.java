 import java.util.Scanner;
 class Main{
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         long N=sc.nextInt();
         long p=1;
         while(N!=0)
         {
             p*=N;
             N-=1;
         }
         System.out.print(p);
     }
 }