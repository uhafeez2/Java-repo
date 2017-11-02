import java.util.Scanner;



public class WordStart
{
    public static void main(String[] args)
    {
           Scanner in = new Scanner( System.in);
           System.out.printf("Please enter a word: ");
           String word = in.nextLine();
           char letter = word.charAt(0);
           char  vowel = word.charAt(0);
           if ((vowel == 'a') || (vowel == 'i')|| (vowel == 'i')|| (vowel == 'o')|| (vowel == 'u')|| (vowel == 'A')|| (vowel == 'E')|| (vowel == 'I')|| (vowel == 'O')|| (vowel == 'U'))
           {
            System.out.printf("%s starts with a vowel.\n", word);
           }
           else if ("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(letter)!= -1)
           {
               System.out.printf("%s starts with a consonant.\n", word);
           }
           else
           {
               System.out.printf("%s starts with neither a vowel nor a consonant.\n", word);
           }
        
        
    }
    
}

