import java.util.Arrays;

public class BubbleSort
{
    public static int[] bubbleSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String []args)
    {
        int [] arr = {2, 5, 6, 1, -1, 4};
        System.out.println("Before Sorting: "+Arrays.toString(arr));
        System.out.println("After Sorting: "+Arrays.toString(bubbleSorting(arr)));
    }
}
