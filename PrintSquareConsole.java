
/* Simulation of console-I/O program PrintSquare,
   using ConsoleApplet as a basis.  See the file
   ConsoleApplet.java for more information.
   
   David Eck
   eck@hws.edu
   
*/

public class PrintSquareConsole extends ConsoleApplet {

   protected String getTitle() {
      return "Sample program \"PrintSquare\"";
   }

   protected void program() {

      // a program that computes and prints the square
      // of a number input by the user.

      int userInput;  // the number input by the user
      int square;     // the userInput, multiplied by itself
      
      console.put("Please type a number: ");
      userInput = console.getInt();
      square = userInput * userInput;
      console.put("The square of that number is ");
      console.putln(square);
      

   }

}
