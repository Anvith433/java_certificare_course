import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       for(int i=1;i<=(2*N);i++)
       {
           if(i<=N)
           {
           for(int j=1;j<=(2*N);j++)
           {
               if((j>=1 && j<=(N-i+1)) || (j>=N+i && j<=(2*N)))
               {
                   System.out.print("* ");
               }
               else 
               {
                   System.out.print("  ");
               }
           }
           System.out.println();
       }
       else 
       {
        for(int j=1;j<=(2*N);j++)
        {
            if((j>=1 && j<=i-N) || (j>=(2*N)-((i-N)-1 ) && j<=(2*N)))
            {
                System.out.print("* ");
            }
            else 
            {
                System.out.print("  ");
            }
        }
        System.out.println();
       }
    }
}
}