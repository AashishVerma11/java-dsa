public class LargestElement{
    public static void main(String [] args)
    {
       int largestEle  = Integer.MIN_VALUE;

       int [] arr ={2, 5, 6, 8, 12, -9};

       for(int val : arr)
       {
         if(largestEle<val)
         {
            largestEle = val;
         }
       }

       System.out.println("Largest value in an array: "+largestEle);

    }
}