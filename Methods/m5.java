import java.util.Scanner;
class Main 
{
    static int perimeterOfSquare(int side)
    
    {
        
     return 4*side;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);      
        int side= sc.nextInt();
        int val=perimeterOfSquare(side);
        System.out.println(val);
        sc.close();
    }
    
}