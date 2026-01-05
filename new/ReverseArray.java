import java.util.Arrays;

public class ReverseArray
{

    public static int[] reverseArray(int[]arr)
    {
        for(int i =0, j=1; i<arr.length/2; i++, j++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length-j];
            arr[arr.length-j] = temp;
        }

        return arr;
    }


    public static void main(String[] args)
    {
        int arr[] ={2, 4, 6, 8, 10, 12};

        System.out.println("Before Reverse: "+Arrays.toString(arr));

        System.out.println("After Reverse Array: "+Arrays.toString(reverseArray(arr)));
    }
}
