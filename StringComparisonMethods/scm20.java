import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A=N;
        int c=0;
        int sum=0;
        while(N!=0)
        {
            N=N/10;
            c++;
        }
        int S=A;
        while(A!=0)
        {
            int b=A%10;
            sum+=Math.pow(b,c);
            A=A/10;
        }
        if(sum==S)
        {
            System.out.print("Armstrong Number");
        }
        else 
        {
            System.out.print("Not an Armstrong Number");
        }
    }
}