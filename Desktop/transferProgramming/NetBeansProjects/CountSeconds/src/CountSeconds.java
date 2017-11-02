import java.util.Scanner;


public class CountSeconds
{
    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       System.out.printf("Please specify the number of seconds (between 1 and 86400): ");
       int seconds = in.nextInt();
       if ((seconds < 1) || (seconds > 86400))
               {
                  System.out.printf("The number of seconds must be between 1 and 86400.\n"); 
               }
       else 
       {
           int hours = seconds/3600;
           int remainder = seconds%3600; 
           int minutes = remainder/60;
           int sec = remainder%60;
           System.out.printf("%d seconds correspond to %d hours, %d minutes, and %d seconds.\n", seconds, hours, minutes, sec);
       }
      
        
        
    }
    
}

