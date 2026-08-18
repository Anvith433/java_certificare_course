import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int A=X;
        int sum=0;
        while(X!=0)
        {
            int f=X%10;
            sum+=(int) Math.pow(f,3);
            X=X/10;
        }
        if(sum==A)
        {
            System.out.print("True");
        }
        else 
        {
            System.out.println("False");
        }
    }
}