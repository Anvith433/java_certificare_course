import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] words=input.split(" ");
        String platform=words[words.length-1];
        String separator;
        if(platform.equals("WIN"))
        {
            separator=">";
        }
        else 
        {
            separator="/";
        }
        for(int i=0;i<words.length-1;i++)
        {
            System.out.print(words[i]);
            if(i!=words.length-2)
            {
                System.out.print(separator);
            }
        }
    }
}