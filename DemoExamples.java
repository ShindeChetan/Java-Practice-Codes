
package exceptionexamples;



public class DemoExamples
{
    public static void main(String[] args) 
    {
        int i,j,k=0;
        int a[]=new int[4];
        i=8;
        j=2;
        try
        {
            k=i/j;
            for(int m=0;m<=4;m++)
            {
                a[m]=m+1;
            }
            for(int value : a)
            {
                System.out.println(value);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Maximun number of values is 4");
        }
       catch(Exception e)
       {
           System.out.println("Unknown Exception");
       }
    }
}
