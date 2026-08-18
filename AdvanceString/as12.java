import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String p=sc.nextLine();
        int a=p.length();
        for(int i=0;i<a;i++)
        {
            if(p.charAt(i)>=65 && p.charAt(i)<=90)
            {
                System.out.print("Valid Password");
                System.exit(0);
            }
            else 
            {
                continue;
            }
        }
        System.out.print("Invalid Password");
    }
}