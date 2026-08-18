import java.util.Scanner;

class Main {

    static Character secondChar(String a) {
      
      return a.charAt(1);
      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char c=secondChar(n);
        sc.close();
   System.out.println(c);
    }

}