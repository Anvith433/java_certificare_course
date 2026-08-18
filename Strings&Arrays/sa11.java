import java.util.*;
class Main {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String[] word=sentence.split(" ");
        String acronyms="";
        for(int i=0;i<word.length;i++)
        {
            if(i==word.length-1)
            {
                acronyms+=word[i].charAt(0);
            }
            else 
            {
            acronyms+=word[i].charAt(0)+".";
            }
        }
        System.out.println(acronyms);
    }
}