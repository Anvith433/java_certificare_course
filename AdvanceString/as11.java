import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=s.length();

        for(int i=0;i<a;i++)
        {
            if(s.charAt(i)==48 || s.charAt(i)==49 || s.charAt(i)==50 || s.charAt(i)==51 || s.charAt(i)==52 || s.charAt(i)==53 || s.charAt(i)==54 || s.charAt(i)==55 || s.charAt(i)==56 || s.charAt(i)==57)
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