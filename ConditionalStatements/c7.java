import java.util.Scanner;
class Hello{
    public static void main(String[] args)
    {
        Scanner sp=new Scanner(System.in);
        String s=sp.nextLine();
        int a=s.length();
        int b=(a>7)?1:0;
        if(b==1)
        {
            System.out.print("True");
        }
    else 
    {
        System.out.print("False");
    }
    }
}