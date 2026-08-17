import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in);
       int M=sc.nextInt();
       int N=sc.nextInt();
       for(int i=1;i<=M+2;i++)
       {
           if(i==1 || i==M+2)
           {
               for(int j=1;j<=N+2;j++)
               {
                   if(j==1 || j==N+2)
                   {
                       System.out.print("+");
                   }
                   else 
                   {
                       System.out.print("-");
                   }
               }
               System.out.println();
             
           }
           else 
           {
               for(int j=1;j<=N+2;j++)
               {
                   if(j==1 || j==N+2)
                   {
                       System.out.print("|");
                   }
                   else {
                       System.out.print(" ");
                   }
               }
               System.out.println();
           }
       }
    }
}