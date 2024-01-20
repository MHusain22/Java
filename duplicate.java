import java.util.Scanner;
public class duplicate 
{
    public static void main(String[] args) 
    {
        int arr[]=new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=in.nextInt();    
        }
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i+1; j < arr.length; j++) 
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("It contain duplicate value");
                    break;
                }
                
            }    

        }
        
    }   
}
