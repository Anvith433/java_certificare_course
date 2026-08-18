import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner c=new Scanner(System.in);
        int a=c.nextInt();
        int b=c.nextInt();
        int p=(a>b)?a:b;
        System.out.print(p);
    }
}