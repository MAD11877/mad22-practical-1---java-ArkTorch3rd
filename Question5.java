import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    int[] array = new int[count];
    for(int i = 0; i < count; i++)
    {
      int input = in.nextInt();
      array[i] = input;
    }
    int maxValue = 0;
    int maxCount = 0;
    for (int i = 0; i < array.length; i++) 
    {
      int track = 0;
      for (int j = 0; j < array.length; j++) 
      {
        if (array[j] == array[i])
        {
          track++;
        }
      }
      if (track > maxCount) 
      {
        maxCount = track;
        maxValue = array[i];
      }
    }
    System.out.println(maxValue);
  }
}
