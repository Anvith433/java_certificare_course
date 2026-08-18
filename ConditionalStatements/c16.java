import java.util.Scanner;
class Se
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        int a=e.nextInt();
        int b=e.nextInt();
        int c=e.nextInt();
        String f=((a+b+c)==180)?"It's a Triangle":"It's not a Triangle";
        System.out.print(f);
    }
}