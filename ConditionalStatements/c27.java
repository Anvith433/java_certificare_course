import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String e=(a==11 || a==12 || a==1)?"Winter":(a==2 || a==3)?"Spring":(a==4 || a==5 || a==6)?"Summer":(a==7 || a==8)?"Rainy":"Autumn";
        System.out.print(e);
    }
}
