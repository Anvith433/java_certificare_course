import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        int a=e.nextInt();
        String s=((a<3))?"Not Polygon":(a==3)?"Triangle":(a==4)?"Quadrilateral":(a==5)?"Pentagon":"Big Polygon";
        System.out.println(s);
    }
}