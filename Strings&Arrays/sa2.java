import java.util.*;
class Fruits{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String[] words=sentence.split(" ");
      List<String> list=Arrays.asList(words);
      Collections.reverse(list);
      System.out.println(list);
    }
    
}