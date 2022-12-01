import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Puzzle1
{
    public int puzzle2() throws FileNotFoundException
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
                sum+=Integer.parseInt(command);
            }
        }
        return max1+max2+max3;
    }
    
    public int puzzle1() throws FileNotFoundException
    {
        // put your code here
        File input = new File ("Input.txt");
        Scanner s = new Scanner(input);
        int sum=0;
        int max1=-1;

        while(s.hasNext()) 
        {
            String command = s.nextLine();
            if (command.equals(""))
            {
                if (sum>=max)
                {
                    max=sum;
                }
                sum=0;
            }
            else
            {
                sum+=Integer.parseInt(command);
            }
        }
        return max;
    }
}
