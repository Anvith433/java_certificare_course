import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int c=0;
        for(int i=N;i>0;i--)
        {
            if(N%i==0)
            {
               c++; 
            }
            if(c==K)
            {
                System.out.print(i);
                System.exit(0);
            }
        }
        if(c<K)
        {
            System.out.print("1");
        }
    
    }
}