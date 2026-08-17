
import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       switch(s){
           case "February":
               System.out.print("28");
               break;
            case "April":
             case   "June":
              case  "September":
              case  "November":
                System.out.print("30");
                break;
            case "January":
             case   "March":
             case   "May":
              case  "July":
              case  "August":
              case  "October":
              case  "December":
                System.out.print("31");
                break;
        
       } 
    }
}