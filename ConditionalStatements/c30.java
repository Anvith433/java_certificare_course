import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        char e=n.next().charAt(0);
        int a=n.nextInt();
        int b=n.nextInt();
        if(e=='/')
        {
            float p=(float)a/b;

         System.out.printf("%.1f\n",p);
        }
        else{
        int d=(e=='+')?a+b:(e=='-')?a-b:(e=='*')?a*b:a%b;
        System.out.print(d);
        }
        
    }
}