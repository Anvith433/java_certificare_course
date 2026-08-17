import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String f=sc.nextLine();
        int N=f.length();
        String p="";
        for(int i=1;i<=N;i++)
        {
            int M=sc.nextInt();
            p+=f.charAt(M);
        }
        System.out.print(p);
    }
}