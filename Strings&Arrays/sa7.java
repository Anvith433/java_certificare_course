import java.util.*;
 class Sentence{
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         String cor=sc.nextLine();
         String[] word=cor.split(" ");
         String rev="";
         for(int i=word.length-1;i>=0;i--)
         {
             if(i==0)
             {
                 rev+=word[i];
             }
             else 
             {
             rev+=word[i]+" ";
             }
         }
         System.out.println(rev);
     }
 }