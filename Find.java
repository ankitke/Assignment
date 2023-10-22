Q4. Write a Java program to find the index of a specific element in an array?

class Find
{
    public static void main(String args[])
    {
        int arr[]={3,5,4,8,6};
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==8)
            {
                System.out.print("Index of 8 is= "+i);
            }
            
        }
    }
}