import java.util.Scanner;

class Main {

    static void validateAtmPinCode(String pin) {
        
        if((pin.length()==4) || (pin.length()==6) && pin.matches("\\d+"))
        {
            System.out.println("Valid PIN Code");
        }
        else {
            System.out.println("Invalid PIN Code");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String pin = sc.nextLine();
        validateAtmPinCode(pin);
        sc.close();
    }

}