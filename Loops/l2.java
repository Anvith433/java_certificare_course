import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int M=n.nextInt();
        int N=n.nextInt();
        while(M!=N+1)
        {
            System.out.printf("%d\n",M);
            M=M+1;
        }
        
    }
}