import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<26;i++)
        {
            int num=sc.nextInt();
            System.out.print((char)('a'+num-1));
        }
    }
}