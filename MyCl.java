Q2. Write a program to create an object of an class which contain a method and call that class method in main method.

class MyCl
{
    static void name( )
    {
        System.out.println("My name is Ankit");
    }
    
    public static void main(String args[])
    {
        MyCl m=new MyCl();
        m.name();
        
    }
}