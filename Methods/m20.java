import java.util.*;

class Main {

    static void getLowerAndUpperCaseLetters(String s) {
        String S="";
        String W="";
        int a=s.length();
        for(int i=0;i<a;i++)
        {
        if(s.charAt(i)>=65 && s.charAt(i)<=90)
        {
          S+=s.charAt(i);
        }
        else if(s.charAt(i)>=97 && s.charAt(i)<=122)
        {
            W+=s.charAt(i);
        }
        }
        System.out.println(S);
        System.out.print(W);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        getLowerAndUpperCaseLetters(s);
        sc.close();
    }
}