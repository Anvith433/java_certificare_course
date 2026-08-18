import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        int N=e.nextInt();
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}