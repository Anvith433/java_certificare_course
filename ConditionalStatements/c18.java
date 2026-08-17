import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner er=new Scanner(System.in);
        int r=er.nextInt();
        int t=er.nextInt();
        String g=((r==6) || (t==6) || (r-t)==6 || (t-r)==6 || (r+t)==6)?"Lucky":"Not Lucky";
        System.out.print(g);
    }
}