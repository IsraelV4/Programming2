package Project;

public class Driver {
    

    public static void main(String[] args) throws InterruptedException {
        Political f1 = new Political("Part1");
        Vote f2 = new Vote("Part 2");
        Result f3 = new Result("Part 3");
        f1.setVisible(true);
        int i=0;
        while (true) {
            i++;
            if (i%100000000==0) {
                System.out.print("");
                if (f1.action==1) {
                    f3.recieveVoter(f1.tmp);
                    f2.setVisible(true);
                    f1.action = 0;
                }
                else if (f2.action==-1) {
                    f3.recieveVote(f2.cycle-1, f2.prev);
                    f2.action = 0;
                }
                else if (f2.action == 1) {
                    f3.setVisible(true);
                    f2.action=0;
                    f3.updateVote();
                }
                else if (f3.action==1) {
                    f3.action = 0;
                    f1 = new Political("Part 1", f3.voters);
                    f2 = new Vote("Part 2");
                    f1.setVisible(true);
                }
            }
        }
    }
}
