import java.util.Arrays;

public class TrappedRainWaterProblem {
    public static int trappedRainWater(int[] arr) {
        // first we store maxleft boundry
        // second we stroe maxright boundry

        int[] maxLeft = new int[arr.length];
        maxLeft[0] = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            maxLeft[i] = Math.max(arr[i], maxLeft[i-1]);
        }

        System.out.println(Arrays.toString(maxLeft));

        int [] maxRight = new int[arr.length];
        maxRight[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--)
        {
            maxRight[i] = Math.max(arr[i], maxRight[i+1]);
        }
System.out.println(Arrays.toString(maxRight));
        int trappedWater = 0;
        for(int i=0; i<arr.length; i++)
        {
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);
            trappedWater = trappedWater + waterLevel-arr[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int [] height ={4,2,0,6,3,2,5};
       System.out.println( trappedRainWater(height));
    }
}
