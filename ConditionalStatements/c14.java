import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner ee=new Scanner(System.in);
        int a=ee.nextInt();
        String gg=(a>=18)?"Eligible":"Not Eligible";
        System.out.print(gg);
    }
}