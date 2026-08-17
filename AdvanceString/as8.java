import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String g=sc.nextLine();
        int a=g.length();
        String p="";
        for(int i=0;i<a;i++)
        {
            if(g.charAt(i)=='-')
            {
                p+='/';
            }
            else 
            {
                p+=g.charAt(i);
            }
        }
        System.out.print(p);
    }
}