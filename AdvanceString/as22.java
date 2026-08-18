import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String g=sc.nextLine();
        String p="";
        int a=g.length();
        int c=0;
        for(int i=0;i<a/2;i++)
        {
            if((g.charAt(a-i-1)==g.charAt(i)) || (g.charAt(a-i-1)==g.charAt(i)+32) || (g.charAt(a-i-1)==g.charAt(i)-32))
            {
                c++;
            }
        }
        if(c==a/2)
        {
            System.out.print("True");
        }
        else 
        {
            System.out.print("False");
        }
    }
}