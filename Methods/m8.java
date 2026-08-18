import java.util.Scanner;

class Main {
    
    static void Indexing(String word, int index) {
         System.out.println(word.charAt(index));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int index = sc.nextInt();
        Indexing(word,index);
    }

}