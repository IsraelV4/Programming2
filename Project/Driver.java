package Project;

public class Driver {
    

    public static void main(String[] args) throws InterruptedException {
        Political f1 = new Political("Part1"); // First page
        Vote f2 = new Vote("Part 2"); // Second Page
        Result f3 = new Result("Part 3"); // Third Page
        f1.setVisible(true); // Shows the user the first page
        int i=0;
        while (true) {
            i++;
            if (i%100000000==0) { // Only runs every 1/10 of a second
                System.out.print("");
                if (f1.action==1) { // If the user finishes entering their information
                    // Gives the results page the voters information so there's no double votes
                    // Opens page 2
                    f3.recieveVoter(f1.tmp);
                    f2.setVisible(true);
                    f1.action = 0;
                }
                else if (f2.action==-1) {// Runs if the user votes for a candiate
                    // Allows the third page to calculate the total votes
                    // Does not open the 3rd page
                    f3.recieveVote(f2.cycle-1, f2.prev);
                    f2.action = 0;
                }
                else if (f2.action == 1) { // Runs when the user selects see results
                    // Opens the third page
                    f3.setVisible(true);
                    f2.action=0;
                    f3.updateVote();
                }
                else if (f3.action==1) { // Runs when the user finishes viewing the results and allows
                    // A new voter to vote
                    f3.action = 0;
                    f1 = new Political("Part 1", f3.voters);
                    f2 = new Vote("Part 2");
                    f1.setVisible(true);
                }
            }
        }
    }
}
