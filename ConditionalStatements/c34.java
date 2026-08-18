import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner r=new Scanner(System.in);
        char c=r.next().charAt(0);
        switch(c)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.print("Vowel");
            break;
            case 'B':
            case 'C':
            case 'D':
            case 'F':
            case 'G':
            case 'H':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                System.out.print("Consonant");
                break;
            default:
              System.out.print("Not an Alphabet");
        }
    }
}