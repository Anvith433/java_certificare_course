import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        int a=S.length();
        String P="";
        for(int i=0;i<a;i++)
        {
            char X=(char) S.charAt(i);
            if((X>='A' && X<='Y') || (X>='a' && X<='y'))
            {
                char newchar=(char) (X+1);
                P+=newchar;
            }
            else if(X=='Z')
            {
                P+='A';
            }
            else if(X=='z')
            {
                P+='a';
            }
            else 
            {
              char newchar1=(char) (X);
              P+=newchar1;
            }
        }
        
        System.out.print(P);
            
    }
    
    }
