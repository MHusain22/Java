public class spyProblem {
    public static void main(String[] args) {
        int arr[] = { 5,2,3,7,1 };
        int n = arr.length;

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