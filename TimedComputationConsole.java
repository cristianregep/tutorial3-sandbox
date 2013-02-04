
/* Simulation of console-I/O program TimedComputation,
   using ConsoleApplet as a basis.  See the file
   ConsoleApplet.java for more information.
   
   David Eck
   eck@hws.edu
   
*/

public class TimedComputationConsole extends ConsoleApplet {

   protected String getTitle() {
      return "Sample program \"TimedComputation\"";
   }

   protected void program() {

     /* This program performs some mathematical computations and displays
        the results.  It then reports the number of seconds that the 
        computer spent on this task.
     */
     
     long startTime;   // Starting time of program, in milliseconds.
     long endTime;     // Time when computations are done, in milliseconds.
     double time;      // Time difference, in seconds.
     
     startTime = System.currentTimeMillis();
     
     double width, height, hypotenuse;  // sides of a triangle
     width = 42.0;
     height = 17.0;
     hypotenuse = Math.sqrt( width*width + height*height );
     console.put("A triangle with sides 42 and 17 has hypotenuse ");
     console.putln(hypotenuse);
     
     console.putln("\nMathematically, sin(x)*sin(x) + cos(x)*cos(x) - 1 should be 0.");
     console.putln("Let's check this for x = 1:");
     console.put("      sin(1)*sin(1) + cos(1)*cos(1) - 1 is ");
     console.putln( Math.sin(1)*Math.sin(1) + Math.cos(1)*Math.cos(1) - 1 );
     console.putln("(There can be round-off errors when computing with real numbers!)");
     
     console.put("\nHere is a random number:   ");
     console.putln( Math.random() );
     
     endTime = System.currentTimeMillis();
     time = (endTime - startTime) / 1000.0;
     
     console.put("\nRun time in seconds was:  ");
     console.putln(time);

   }

}
