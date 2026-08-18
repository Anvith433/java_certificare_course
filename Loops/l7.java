import java.util.Scanner;
class Main{
public static void main(String[] args)
{
    Scanner n=new Scanner(System.in);
    int N=n.nextInt();
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}