public class MaxMinArr
{
    public static void main(String[] args) 
    {   
        int [] arr = new int [] {25, 11, 7, 75, 56};  
        int max=arr[0];
        int min=arr[0];
       
        for (int i = 0; i < arr.length; i++) 
        {
           
            
                if (arr[i] > max) 
                {
                     max = arr[i];
                    
                }
             
            
        }
        System.out.println("The Max of the array is : " + max);
        for (int i = 0; i < arr.length; i++) 
        {
           
            
                if (arr[i] < min) 
                {
                     min = arr[i];
                    
                }
             
            
        }
        System.out.println("The Min of the array is : " + min);
    }

    
}

