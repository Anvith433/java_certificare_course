import java.util.*;
class main{
    public static int SumofDigits(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            int Number=sc.nextInt();
            int value=SumofDigits(Number);
            System.out.println(value);
    }
}