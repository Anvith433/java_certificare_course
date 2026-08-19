import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String[] arr=sentence.split(" ");
        StringBuilder string=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            String word=arr[i];
            int index=-1;
            for(int j=0;j<word.length();j++)
            {
                char ch=Character.toLowerCase(word.charAt(j));
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                    index=j;
                    break;
                }
            }
            if(index>0)
            {
                word=word.substring(index)+word.substring(0,index);
            }
            string.append(word);
            if(i!=arr.length-1)
            {
                string.append(" ");
            }
        }
        System.out.println(string);
    }
}