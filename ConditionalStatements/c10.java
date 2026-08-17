import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner tt=new Scanner(System.in);
        int a=tt.nextInt();
        String p=(a>50)?"PASS":"FAIL";
        
        System.out.println(p);
    }
}