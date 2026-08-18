import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        int s=0;
        Scanner ee=new Scanner(System.in);
        int a=ee.nextInt();
        while(a!=0)
        {
            s=s+(a%10);
            a=a/10;
        }
        System.out.println(s);   

     } 

    }
