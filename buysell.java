public class buysell 
{   
    public static void main(String[] args) 
    {
        int[] arr = {7,1,5,3,6,4};
        int k;
        int max=0;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i+1 ; j < arr.length; j++) 
            {
                k = arr[j] - arr[i];
                if (k > max) 
                {
                    max = k ;    
                }
            }
                
        }
        System.out.println(max);   
        
    }
    
}
