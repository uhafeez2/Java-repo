import java.util.Scanner;



public class NumbersToMonths 
{
    public static void main(String[] args) 
    {
      Scanner in = new Scanner(System.in);
      System.out.printf("Please indicate a month as an integer from 1 to 12: ");
      int month = in.nextInt();
      if((month < 1) || (month > 12))
   {
       System.out.printf("This number does not correspond to a month.\n");
   }
      if((month==1))
   {
    System.out.printf("January\n");
    }
      if((month==2))
      {
          System.out.printf("February\n");
     }
       if((month==3))
      {
          System.out.printf("March\n");
      }
        if((month==4))
      {
          System.out.printf("April\n");
      }
         if((month==5))
      {
          System.out.printf("May\n");
      }
          if((month==6))
      {
          System.out.printf("June\n");
      }
           if((month==7))
      {
          System.out.printf("July\n");
      }
            if((month==8))
      {
          System.out.printf("August\n");
      }
             if((month==9))
      {
          System.out.printf("September\n");
      }
              if((month==10))
      {
          System.out.printf("October\n");
      } if((month==11))
      {
          System.out.printf("November\n");
      }
       if((month==12))
      {
          System.out.printf("December\n");
      }
      
}
} 