import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Puzzle1
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class d
     */
    public Puzzle1()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod() throws FileNotFoundException
    {
        // put your code here
        File input = new File ("Input.txt");
        Scanner s = new Scanner(input);
        int sum=0;
        int max1=-1;
        int max2=-2;
        int max3=-3;
        while(s.hasNext()) 
        {
            String command = s.nextLine();
            if (command.equals(""))
            {
                System.out.println(sum+" "+max1+" "+max2+" "+max3);
                if (sum>=max1)
                {
                    max3=max2;
                    max2=max1;
                    max1=sum;
                    
                    
                }
                else if (sum>=max2)
                {
                    max3=max2;
                    max2=sum;
                    
                }
                else if (sum>=max3)
                {
                    max3=sum;
                }
                sum=0;
            }
            else
            {
                //System.out.println(Integer.parseInt(command));
                sum+=Integer.parseInt(command);
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
        return max1+max2+max3;
    }
}
