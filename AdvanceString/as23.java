import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll(" ","").toLowerCase();
        s=s.replaceAll("'","");
        int a=s.length();
        int c=0;
        for(int i=0;i<a/2;i++)
        {
            if(s.charAt(i)==s.charAt(a-i-1))
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