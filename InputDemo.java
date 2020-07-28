
package exceptionexamples;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class InputDemo 
{

    public static void main(String[] args) throws Exception 
    {
        BufferedReader br=null;
        try
        {
          
            String str="";
            br=new BufferedReader(new InputStreamReader(System.in));
            str=br.readLine();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            br.close();
        }
        
    }
}
