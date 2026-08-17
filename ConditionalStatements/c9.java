import java.util.Scanner;
class Hello{
    public static void main(String[] args)
    {
        Scanner p=new Scanner(System.in);
        String q=p.nextLine();
        int a=q.length();
        String t="";
        for(int i=0;i<a;i++)
        {
            if(i==0 || i==a-1)
            {
                t+=q.charAt(i);
            }
            else 
            {
             t+="*";   
            }
            
        }
        System.out.print(t);
    }
}