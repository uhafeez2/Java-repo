import java.util.Scanner;

public class CountWords
{
    public static int countWords(String text)
    {
        int result=0;       
for (int i = 0; i < text.length(); i++)
{
    if (text.charAt(i) == ' '); 
    {
        result++;
    }
    while(text.charAt(i) != ' ' && i < text.length()-1)
    {
        i++;
    }
}
       return result; 
    }

  
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    
    while (true)
    {
      System.out.printf("Enter some text, or q to quit: ");
      String text = in.nextLine();
      if (text.equals("q"))
      {
        System.out.printf("Exiting...\n");
        break;
      }
      int result = countWords(text);
      System.out.printf("Counted %d words.\n\n", result);
    }
  }
}