import java.util.Scanner;
class Ti
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        int a=e.nextInt();
        int b=e.nextInt();
        int c=e.nextInt();
        int s=(a>b)?((a>c)? a:c):((b>c)?b:c);
        System.out.print(s);
        
    }
}