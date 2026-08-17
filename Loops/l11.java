import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int s=0;
        for(int i=1;i<=N;i++)
        {
            if(i%2!=0)
            {
               s+=i; 
            }
            
        }
        System.out.printf("%d",s);
        
    }
}