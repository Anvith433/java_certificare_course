import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=s.length();
        int c=0;
        int p=0;
        int k=0;
        for(int i=0;i<a;i++)
        {
         if(s.charAt(i)>=65 && s.charAt(i)<=90)
         {
             c++;
             
         }
         else if(s.charAt(i)>=97 && s.charAt(i)<=122)
         {
             p++;
         }
          else if(s.charAt(i)>=48 && s.charAt(i)<=53)
          {
              k++;
          }
        }
        if(c>=1 && p>=1 && k>=1)
        {
            System.out.print("Valid Password");
        }
        else 
        {
        System.out.print("Invalid Password");
    }
}
}