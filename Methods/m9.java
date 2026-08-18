import java.util.Scanner;

class Main {

    static String message(String name, int age) {
        return name +" "+"is"+" "+age+" "+"years old.";

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        String sentence=message(name,age);
        System.out.println(sentence);
        sc.close();
    }
}
