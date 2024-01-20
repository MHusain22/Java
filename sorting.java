// import java.util.Scanner;           //bubble sort
// public class sorting 
// {
//     public static void printarr(int arr[])
//     {
//         for (int i = 0; i < arr.length; i++) 
//         {
//             System.out.println(arr[i]);    
//         }
//     }
//     public static void main(String[] args) 
//     {
//         int temp;
//         System.out.println("Enter the size of array : ");
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         int[] arr= new int[n];
//         for (int i = 0; i < arr.length; i++) 
//         {
//             arr[i]= input.nextInt();    
//         }
//         for (int i = 0; i < n-1; i++) 
//         {
//             for (int j = 0; j < n-i-1; j++) 
//             {
//                 if (arr[j] < arr[j+1]) 
//                 {
//                     temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 } 
//                 else 
//                 {
//                     continue;    
//                 }    
//             } 
//             printarr(arr);   
//         }
//     }    
// }




// import java.util.Scanner;      //selection sort
// public class sorting 
// {
//     public static void printarr(int arr[])
//     {
//         for (int i = 0; i < arr.length; i++) 
//         {
//             System.out.println(arr[i]);    
//         }
//     }
//     public static void main(String[] args) 
//     {
//         int temp;
//         System.out.println("Enter the size of array : ");
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         int[] arr= new int[n];
//         for (int i = 0; i < arr.length; i++) 
//         {
//             arr[i]= input.nextInt();    
//         }
//         for (int i = 0; i < n-1; i++) 
//         {
//             int smallest = i;
//             for (int j = i+1; j < n; j++) 
//             {

//                 if (arr[smallest] > arr[j]) 
//                 {
//                     smallest = j;
//                 } 
                
//             } 
//              temp = arr[smallest];
//                 arr[smallest] = arr[i];
//                 arr[i] = temp;
//             printarr(arr);   
//         }
//     }    
// }


public class sorting    //insertion sort
{
    public static void printarr(int arr[])
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {5,4,3,2,1};
        for (int i = 1; i < arr.length; i++) 
        {
            int current = arr[i];
            int j=i-1;
            while (j>=0 && current < arr[j]) 
            {
                arr[j+1] = arr[j];
                j--;    
            }
            arr[j+1] = current;
        }    
        printarr(arr);
    }
}