package csen703.main.assignment1;

public class RingToss {

    public static int RingTossGreedy(int[] pegs) {
        int tosses = 0;
        int pre = 0;
        for (int peg : pegs) {
            if (peg == 0) {
                pre = peg;
                continue;
            }
            tosses = peg >= pre ? tosses + peg - pre : tosses;
            pre = peg;
        }
        return tosses;
    }

}




