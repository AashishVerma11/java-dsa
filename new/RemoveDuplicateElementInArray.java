import java.util.Arrays;

public class RemoveDuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 7, 2, 3, 4};

        int countDuplicate = 0;

        // Step 1: Count duplicates
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    countDuplicate++;
                    break;   // IMPORTANT
                }
            }
        }

        // Step 2: Create temp array for unique elements
        int[] temp = new int[arr.length - countDuplicate];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean flag = false; // assume it's unique

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true; // duplicate found
                    break;
                }
            }

            if (!flag) {
                temp[index++] = arr[i]; // add only unique value
            }
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Unique Elements: " + Arrays.toString(temp));
    }
}
