import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String W=sc.nextLine();
        int a=W.length();
    
        for(int i=0;i<a;i++)
        {
            if(i<a-1)
            {
         System.out.print(W.charAt(i)+"-");
            }
            else 
            {
                System.out.print(W.charAt(i));
            }
        }
    }
}