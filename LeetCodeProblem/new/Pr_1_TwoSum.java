import java.util.Arrays;

public class Pr_1_TwoSum {
   
    public static int[] findTwoSum(int[] arr, int target) {
        

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                   return new int[]{i,j};
                }
            }
        } 

        return new int[]{};
    }
   




    // public static int[] twoSum(int[] nums, int target) {
    //     Map<Integer, Integer> map = new HashMap<>();
    // //  int[] arr1 = { 3, 2, 4 };
    //     for (int i = 0; i < nums.length; i++) {
    //         int need = target - nums[i];

    //         if (map.containsKey(need)) {
    //             return new int[]{map.get(need), i};
    //         }

    //         map.put(nums[i], i);
    //     }
    //     return new int[]{};
    // }



    public static void main(String[] args) {
        
        int[] arr1 = { 3, 2, 4 };
       
        int target1 = 6;

     
        System.out.println(Arrays.toString(findTwoSum(arr1, target1)));
    
    }
}
