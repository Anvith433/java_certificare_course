import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int M=s.nextInt();
        int N=s.nextInt();
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}