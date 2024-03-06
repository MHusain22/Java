import java.util.Scanner;

public class spyProblem {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (n == 0 || n == 1 || n == 2) {
            System.out.println("Not applicable");
        } else if (n == 3) {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            System.out.println("Max is " + max);
        } else {

            int maxsum = 0;

            for (int i = 0; i < arr.length - 2; i++) {
                int sum = arr[i];
                for (int j = i + 2; j <= arr.length - 1; j = j + 2) {
                    if (!(i == 0 && j == n - 1)) {
                        sum = sum + arr[j];
                    }
                    if (maxsum < sum) {
                        maxsum = sum;
                    }
                }
            }

            System.out.println("The sum is :" + maxsum);
        }
    }
}