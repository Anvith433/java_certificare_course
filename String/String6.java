import java.util.Scanner;
class Main
{
    public static void main(String[] args) 
    {
        Scanner sw=new Scanner(System.in);
        String sp=sw.nextLine()+" ";
        int a=sw.nextInt();
        System.out.println(sp.repeat(a));
        
    }
}