import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner str=new Scanner(System.in);
        String s=str.nextLine();
        int a=s.length();
        int i;
        for( i=0;i<a/2;i++)
        {
            System.out.print(s.charAt(i));
        }
        
    }

}