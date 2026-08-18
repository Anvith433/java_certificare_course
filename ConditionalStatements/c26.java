import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner p=new Scanner(System.in);
        int a=p.nextInt();
        String g=((a>=4 && a<12))?"Good Morning":(a>=12 && a<16)?"Good Afternoon":(a>=16 && a<20)?"Good Evening":"Good Night";
        System.out.print(g);
        }
}