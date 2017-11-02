
import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter an integer: ");
        int number = in.nextInt();
        
        if ((number < 0)) {
            System.out.printf("%d is negative.\n", number);
        }
        if ((number >= 0) && (number <= 9)) {
            
            System.out.printf("%d has one digit.\n", number);
        }
        if ((number >= 10) && (number <= 99)) {
            
            System.out.printf("%d has two digits.\n", number);
        }
        if ((number >= 100) && (number <= 999)) {
            
            System.out.printf("%d has three digits.\n", number);
        }
        if ((number >= 1000) && (number <= 9999)) {
            
            System.out.printf("%d has four digits.\n", number);
        }
        if ((number >= 10000) && (number <= 99999)) {
            
            System.out.printf("%d has five digits.\n", number);
        }
        if ((number >= 100000) && (number <= 999999)) {
            
            System.out.printf("%d has six digits.\n", number);
        }
        if ((number >= 1000000)) {
            System.out.printf("%d has more than six digits.\n", number);
        }
    }
}
