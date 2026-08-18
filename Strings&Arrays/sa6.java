import java.util.*;
class Main {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        int[] newNums=new int[n/2];
        int j=0;
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        
        for(int i=n-n/2;i<n;i++)
        {
            newNums[j]=nums[i];
            j++;
        }
    System.out.println(Arrays.toString(newNums));
    }
}