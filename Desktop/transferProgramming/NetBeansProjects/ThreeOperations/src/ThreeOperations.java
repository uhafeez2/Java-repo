import java.util.Scanner;


public class ThreeOperations
{
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.printf("Please enter real number N1: ");
    double N1 = in.nextDouble(); 
    
    System.out.printf("Please enter real number N2: ");
    double N2 = in.nextDouble();
    
    double multiply = N1 * N2; 
    double divide = N1/N2;
    double raise = Math.pow(N1,N2);
    
    System.out.printf(N1 + " * " + N2 + " = %.2f\n", multiply);
    System.out.printf(N1 + " / " + N2 + " = %.2f\n", divide);
    System.out.printf(N1 + " raised to the power of " + N2 + " = %.2f\n", raise);
        
        
        
    }
    
}

