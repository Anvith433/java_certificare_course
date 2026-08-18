import java.util.Scanner;
import java.math.BigInteger;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextInt();
        BigInteger sum=BigInteger.ZERO;
        for(int i=1;i<=N;i++)
        {
            sum=sum.add(BigInteger.valueOf((long) Math.pow(i,3)));
        }
        System.out.println(sum);
    }
}