import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=s.length();
        String p="";
        for(int i=0;i<a;i++)
        {
                p+=s.charAt(a-i-1);
            }
            
        System.out.printf("%s",p);
    }
}