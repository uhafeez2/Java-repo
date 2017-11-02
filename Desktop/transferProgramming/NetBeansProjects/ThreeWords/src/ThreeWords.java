import java.util.Scanner;

public class ThreeWords 
{
   
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter an integer N: ");
       int N = in.nextInt();
        
       
       System.out.printf("Please enter a word with at least %d and at most 20 letters: ", N);
      String one = in.next();
         String four = one.substring(0,N); 
      
        System.out.printf("Please enter a second word with at least %d and at most 20 letters: ", N);
           String two = in.next();
          String five = two.substring(0,N);
            
        System.out.printf("Please enter a third word with at least %d and at most 20 letters: ", N);
           String three = in.next();
           String six = three.substring(0,N);
            
            
            
         System.out.printf("        %s starts with %s\n", one, four);    
         System.out.printf("        %s starts with %s\n", two, five); 
         System.out.printf("        %s starts with %s\n", three, six);
        
        
        
    }
    
}
