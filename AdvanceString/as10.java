import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        String s=n.nextLine();
        int a=s.length();
        int c=0;
        for(int i=0;i<a/2;i++)
        {
            if(s.charAt(a-i-1)==s.charAt(i) || s.charAt(a-i-1)==s.charAt(i)-32 || s.charAt(a-i-1)==s.charAt(i)+32)
            {
           c++;
            }
        }
        if(c==(a/2))
        {
            System.out.print("Palindrome");
        }
        else 
        {
            System.out.println("Not a Palindrome");
        }
    }
}