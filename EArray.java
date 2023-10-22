Q5. Write a java program to print an entire array?

class EArray
{
    public static void main(String args[])
    {
        int arr[]= { 3,7,8,9, 6};
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}