import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String e=((a%10==9) || (a/10==9) || (a%9==0))?"Lucky Number":"Unlucky Number";
        System.out.print(e);
        
    }
}