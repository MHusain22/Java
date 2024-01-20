import java.util.Scanner;
public class ReverseArr
{
    public static void main(String[] args) 
    {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        
        
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=input.nextInt();
            
        }
        System.out.println("The reverse of an array is :");
        for (int i = arr.length-1; i >=0 ; i--) 
        {
            System.out.println(arr[i]);
        }
        
    }
}