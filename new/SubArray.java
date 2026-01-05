public class SubArray {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
       // System.out.println("    "+maxSum);

        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {

                // Print subarray
                for(int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }

                sum = sum + arr[j];
                System.out.println(" -> Sum = " + sum);

                // Update max/min
                if(sum > maxSum) maxSum = sum;
                if(sum < minSum) minSum = sum;
            }
            System.out.println();
        }

        System.out.println("Max Subarray Sum = " + maxSum);
        System.out.println("Min Subarray Sum = " + minSum);
    }
}
