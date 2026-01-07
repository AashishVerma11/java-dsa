public class PrintNumInIncreasingOrder
{
    public static void  printIncNumber(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }

        printIncNumber(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        printIncNumber(10);
    }
}
