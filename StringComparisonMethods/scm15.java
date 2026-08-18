import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int MIN=sc.nextInt();
        for(int i=1;i<N;i++)
        {
            int A=sc.nextInt();
            if(A<MIN)
            {
                MIN=A;
            }
        }
        System.out.print(MIN);
    }
}