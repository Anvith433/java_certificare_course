import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=sc.nextLine();
        int a=str.length();
        int b=str2.length();
        int i=0;
        int j=0;
        while(i<str.length() && j<str2.length())
        {
            
            if(str.charAt(i)==str2.charAt(j))
            {
                j++;
            }
            i++;
        }
        if(j==b)
        {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("No");
        }
    
    }  
}