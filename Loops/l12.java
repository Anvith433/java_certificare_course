import java.util.Scanner;
class Sho{
    public static void main(String[] args)
    {
        Scanner se=new Scanner(System.in);
        int M=se.nextInt();
        int N=se.nextInt();
        int s=0;
        for(int i=M;i<=N;i++)
        {
            if(i%2==0)
            {
                s+=i;
            }
        }
        System.out.printf("%d",s);
    }
}