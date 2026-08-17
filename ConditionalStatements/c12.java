import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        String c=(a==b)?"Equal":"Not Equal";
        System.out.print(c);
    }
}