import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a>=65 && a<=90)
        {
            System.out.print("Uppercase Letter");
        }
        else if(a>=97 && a<=122)
        {
            System.out.print("Lowercase Letter");
        }
        else if(a>=48 && a<=57)
        {
            System.out.print("Digit");
        }
        else 
        {
            System.out.print("Special Character");
        }
    }
}