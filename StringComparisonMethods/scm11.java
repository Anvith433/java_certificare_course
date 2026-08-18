import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int MAX=sc.nextInt();
        System.out.println(MAX);
        for(int i=1;i<N;i++)
        {
            int A=sc.nextInt();
            
            if(A>MAX)
            {
                MAX=A;
                System.out.println(MAX);
            }
     else if(A<=MAX)
     {
         System.out.println(MAX);
     }
        }
    }
}