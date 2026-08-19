import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String inputDateTime=sc.nextLine();
        DateTimeFormatter inputDateFormatter=DateTimeFormatter.ofPattern("MMM dd yyyy hh:mma");
        DateTimeFormatter outputDateFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime outpp=LocalDateTime.parse(inputDateTime,inputDateFormatter);
        String outputDateTime=outpp.format(outputDateFormatter);
        System.out.println(outputDateTime);
    }
}