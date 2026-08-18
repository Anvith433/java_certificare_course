import java.util.*;
class Sentence{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String[] word=sentence.split(" ");
        String newSentence="";
        for(int i=0;i<word.length;i++)
        {
            if(i==word.length-1)
            {
                newSentence+=word[i];
                break;
            }
            newSentence+=word[i]+",";
        }
        System.out.println(newSentence);
        
    }
}