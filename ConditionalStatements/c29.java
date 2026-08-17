import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        int a=e.nextInt();
        int s=0;
        while (a!=0)
        {
            int b=a%10;
            s+=b;
            a=a/10;
        }
        System.out.print(s);
    }
}