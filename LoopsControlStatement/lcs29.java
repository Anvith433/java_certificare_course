import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=(2*N)-1;j++)
            {
                
            
            if(j>=N-i+1 && j<=N+i-1)
            {
                System.out.print("0 ");
            }
            else 
            {
                System.out.print(". ");
            }
        }
        System.out.println();
    }
}
}