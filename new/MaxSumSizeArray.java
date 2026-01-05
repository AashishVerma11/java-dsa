public class MaxSumSizeArray
{
    public static int maxElementSumSize(int[] arr)
    {
        int maxSum = 0;
        int currentSum = 0;
        boolean hasPositive = false;
        String str = "";

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>0)
            {
                hasPositive = true;
            }

            currentSum += arr[i];

            if(currentSum < 0)
            {
                currentSum = 0;
            }else{
                str +=" "+arr[i];
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        if(hasPositive==true)
        {
            System.out.println(str);
            return maxSum;
        }else{
            return 0;
        }
    }



    public static void main(String [] args)
    {
        int[] arr={-2, -3, 4, -1, -2, 1, 5, -3};

        int sum = maxElementSumSize(arr);
        System.out.println(sum);
    }
}