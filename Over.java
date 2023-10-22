//Q1. Write a program to demonstrate method overloading with 3 different parameters.

class Over
{
    void add(int a, int b)
    {
        int c=a+b;
        System.out.println(c);
    }
    
    void add(int a, int b, int c)
    {
        int sum=a+b+c;
        System.out.println(sum);
    }
    
    void add(float a, int b)
    {
        float c=a+b;
        System.out.println(c);
    }
    public static void main(String args[])
    {
        Over ob=new Over();
        ob.add(12.4f,5);
        ob.add(6,3);
        ob.add(3,7,4);
    }
}