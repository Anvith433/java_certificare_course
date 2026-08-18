import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextInt();
        long sum=0;
        for(int i=1;i<=N;i++)
        {
            sum+=(long) Math.pow(i,2);
        }
        System.out.println(sum);
        sc.close();
    }
}