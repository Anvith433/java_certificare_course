import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String sh=((a%11==0) || (a%11==1))?"Special Eleven":"Normal Number";
        System.out.print(sh);
    }
}