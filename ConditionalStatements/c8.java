import java.util.Scanner;
class Solve{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int p=((a>25 && a<75))? 1:0;
        if(p==1)
        {
            System.out.print("True");
        }
        else 
        {
            System.out.print("False");
        }
    }
}