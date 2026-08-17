import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner ey=new Scanner(System.in);
        int s=ey.nextInt();
        int r=ey.nextInt();
        String g=(r>5)?"Bonus":"No bonus";
        if(g.equals("Bonus"))
        {
            float p=((0.05f)*s);
            System.out.print(p);
        }
        else {
            System.out.print(g);
        }
        }
}
