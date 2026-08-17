import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int se=sc.nextInt();
        for(int i=2;i<se;i++)
        {
            if(se%i==0)
            {
                System.out.print("Not a Prime Number");
                System.exit(0);
            }
        }
        System.out.print("Prime Number");
        
    }
}