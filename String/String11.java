import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner ss=new Scanner(System.in);
        String se=ss.nextLine();
        int p=se.length();
        System.out.println(se.charAt(p-1));
    }
}