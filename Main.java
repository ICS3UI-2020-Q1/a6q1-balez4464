import java.util.Scanner;

/**
 *This program allows users to find the average of the heights they input
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);

    //asks user how many heights they want to enter
    System.out.println("How many heights would you like to enter");
    final int NUM_HEIGHTS = input.nextInt();

    //creates array for all the heights
    int[] heights = new int[NUM_HEIGHTS];

    //asks user to print out heights
    System.out.println("Please enter the heights on separate lines");

    //for loop for writing heights
    for (int i = 0; i < heights.length; i++){
      //allows user to print out heights
      heights[i] = input.nextInt();
    }

    //creates variable to store sum
    int sum = 0;

    //for loop for getting average
    for (int i = 0; i < heights.length; i++){
      //adds to sum
      sum = sum + heights[i];
    }

    //determines average
    int average = sum / NUM_HEIGHTS;

    //prints average
    System.out.println("The average height is " + average + " cm");

    //tells user the above average heights
    System.out.println("The heights above average are");

    //if statement and for loop to print heights that are bigger than average
    for (int i = 0; i < heights.length; i++){
      //prints of height is larger
      if(heights[i] > average){
        System.out.println(heights[i]);
      }

    }



  }
}
