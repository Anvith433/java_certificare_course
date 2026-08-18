import java.util.Scanner;

class Main {
    static int countTheVowels(String s)
    {
    int count=0;
    
        int a=s.length();
        for(int i=0;i<a;i++)
        {
            if(s.charAt(i)==97 || s.charAt(i)==101 || s.charAt(i)==105 || s.charAt(i)==111 || s.charAt(i)==117)
            {
                count++;
            }
        }
      return count;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p=s.toLowerCase();
        int val=countTheVowels(p);
        System.out.print(val);

        sc.close();
    }
}