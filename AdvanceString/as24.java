import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String g=sc.nextLine();
        int a=g.length();
        String s="";
        for(int i=0;i<a;i++)
        {
            if(g.charAt(i)=='A'  ||  g.charAt(i)=='a'  || g.charAt(i)=='E'  ||  g.charAt(i)=='e' || g.charAt(i)=='I' || g.charAt(i)=='i' || g.charAt(i)=='O' || g.charAt(i)=='o' || g.charAt(i)=='U' || g.charAt(i)=='u')
            {
                continue;
            }
            else 
            {
                s+=g.charAt(i);
            }
        }
        System.out.print(s);
    }
}