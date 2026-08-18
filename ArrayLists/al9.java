import java.util.*;
class Main{
    public static void main(String[] args)
    {
        ArrayList<Integer> arraylist=new ArrayList<>(Arrays.asList(5,10,20,35,5,50,20,100,200,10,150,100,100,20,20));
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;
        for(int item:arraylist)
        {
            if(N==item)
            {
                count++;
            }
        }
        System.out.println(count);
        
    }
}