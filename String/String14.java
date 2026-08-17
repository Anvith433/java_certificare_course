import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner pp=new Scanner(System.in);
        String pp1=pp.nextLine();
        int x=pp.nextInt();
        int a=pp1.length();
        String pp2=pp1.substring(a-3);
        System.out.println(pp2.repeat(x));
    }
}