import java.util.Scanner;

class Main {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        String ip=sc.nextLine();
        String ss="Hello ";
        System.out.println(ss.concat(ip));
    }
}