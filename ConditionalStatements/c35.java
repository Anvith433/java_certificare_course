import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner e=new Scanner(System.in);
        int a=e.nextInt();
        switch(a){
            case 3:
                System.out.print("Triangle");
                break;
            case 4:
                System.out.print("Quadrilateral");
                break;
            case 5:
                System.out.print("Pentagon");
                break;
            case 6:
                System.out.print("Hexagon");
                break;
            default:
            System.out.print("Polygon");
        }
    }
}