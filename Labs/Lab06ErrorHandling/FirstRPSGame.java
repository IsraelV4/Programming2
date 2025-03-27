package Labs.Lab06ErrorHandling;
/* Program name: Paper, Scissor and Rock Version 0.1
Initially created by Dr. Wenjia Li
Finished by _(Your Name)__ 
_   __(Today’s Date)______ 
*/

import javax.swing.JOptionPane;

public class FirstRPSGame { 

   public static int wrapAround(int n) {
      if (n==3) {
         return 0;
      }
      else if (n<0) {
         return 2;
      }
      return n;
   }
   public static void main(String args[]) { 

      String[] converter = new String[] {"Rock", "Paper", "Sciccors"};
      //Variable declaration
      int yourChoice, computerChoice; //comment please!
      String yourInput; //comment please!

      //Welcome screen and show the basic rule to the user
      JOptionPane.showMessageDialog(null,"Welcome to Paper, Scissor and Rock");
      JOptionPane.showMessageDialog(null,"Let me remind you the rule first:\nScissor cuts paper, paper covers rock, and rock breaks scissors. ");
      JOptionPane.showMessageDialog(null,"0: Rock\n1: Paper\n2: Scissor");

      //Get your choice
      do {
         yourInput = JOptionPane.showInputDialog("Now tell me your choice!");
         yourChoice = Integer.parseInt(yourInput);
      } while (yourChoice>=3 || yourChoice<0);
      

      //Get computer choice
      computerChoice = (int)(Math.random()*3); //generate a random number

      //Compare your Choice with computer’s choice and output the result
      JOptionPane.showMessageDialog(null, "You chose: " + converter[yourChoice] + "\nThe computer chose: " + converter[computerChoice]);
      //Case I: Both you and computer pick the same choice, then it’s a tie!
      if (yourChoice == computerChoice){
          JOptionPane.showMessageDialog(null,"It’s a tie!"); 
      }
      else if (yourChoice==wrapAround(computerChoice+1)){//Case II: You WIN :)
         JOptionPane.showMessageDialog(null,"You win!"); 
      }
      else {//Case III: You lose :(
         JOptionPane.showMessageDialog(null,"You lost!"); 
      }

      




      


   }
}