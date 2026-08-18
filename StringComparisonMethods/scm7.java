import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=s.length();
        String rr="";
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<=1;j++)
            {
                rr+=s.charAt(i);
            }
        }
        System.out.print(rr);
    }
}