import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        int N=e.nextInt();
        int sum=0;
        for(int i=0;i<N;i++)
        {
            int p=e.nextInt();
            sum+=p;
            
        }
        System.out.printf("%d",sum);
    }
}