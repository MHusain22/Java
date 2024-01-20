import java.util.Scanner;
public class MaxSubarray
{
    public static void main(String[] args) 
    {
        int[] arr = new int [9];
        int maxsum=0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=in.nextInt();   
        }
        System.out.println("The subarrays are : ");
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i; j < arr.length; j++) 
            {
                for (int k = i; k <= j; k++) 
                {
                    System.out.println(arr[k]);
                }    
                System.out.println("------");
            }   
        }
        System.out.println("The max of the subarrays is : ");
        for (int i = 0; i < arr.length; i++) 
        {
            int sum=0;
            for (int j = i; j < arr.length; j++) 
            {
                sum=sum+arr[j];
                if (sum > maxsum)
                {
                    maxsum = sum;   
                }
            }   
           
        }
        System.out.println(maxsum);

    }
}