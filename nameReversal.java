import java.io.*;
import java.util.*;
public class nameReversal {
   public static void main(String args[]) {
      Scanner kbReader = new Scanner(System.in);
      System.out.print("Please enter your name: ");
      String nameInput = kbReader.nextLine();
      String nameReverse = "";
      for (int i = nameInput.length() - 1; i >= 0; i--) {
         nameReverse += nameInput.substring(i, i+1);
      }
      System.out.println("Your name in reverse would be: " + nameReverse.toLowerCase());
   }
}
