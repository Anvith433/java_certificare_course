import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr={1,6,32,93,71,-20,30,-90,50};
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>N){
                nums.add(arr[i]);
            }
        }
        System.out.println(nums);
    }
}