import java.util.Scanner;
import java.util.*;
 class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String startDay=sc.nextLine();
        int N=sc.nextInt();
        String[] days={
            "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
        };
        int startIndex=0;
        for(int i=0;i<7;i++)
        {
            if(days[i].equalsIgnoreCase(startDay))
            {
                startIndex=i;
                break;
            }
     }
     int resultIndex=(startIndex + (N-1))%7;
     System.out.println(days[resultIndex]);
     sc.close();
        }
        
    }
