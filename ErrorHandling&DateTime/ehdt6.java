import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String sttr=sc.nextLine();
        DateTimeFormatter dattee=DateTimeFormatter.ofPattern("d MMM yyyy");
        LocalDate datee=LocalDate.parse(sttr,dattee);

        System.out.println(datee.getDayOfWeek());
    }
}