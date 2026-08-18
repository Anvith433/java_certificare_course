import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        if(Math.pow(A,B)>Math.pow(B,A))
        {
            System.out.print((int) Math.pow(A,B));
        }
        else 
        {
            System.out.print((int) Math.pow(B,A));
        }
    }
}