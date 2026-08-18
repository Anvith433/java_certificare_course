import java.util.Scanner;
class Ht{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        int a=e.nextInt();
        int b=e.nextInt();
        int c=e.nextInt();
        String d=((a+b)>c && (a+c)>b && (b+c)>a )?"It's a Triangle":"It's not a Triangle";
        System.out.print(d);
    }
}