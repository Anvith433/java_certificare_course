import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String g=sc.nextLine();
        int a=g.length();
        for(int i=1;i<=a;i++)
        {
            String p=g.substring(0,i);
            System.out.println(p);
        }
    }
}