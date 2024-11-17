package csen703.main.assignment1;

public class RingToss {

    public RingToss() {
    }

    public static int RingTossGreedy2(int[] pegs) {
        int tosses = 0;
        int n = 0;
        for (int peg=0 ; peg<pegs.length ; peg++){
            if(pegs[peg]> n){
                tosses+=pegs[peg]-n;
            }
            n = pegs[peg];
        }
        return tosses;
    }

    public static int RingTossGreedy(int[] pegs) {
        int tosses = pegs[0];
        for (int peg=1 ; peg<pegs.length ; peg++){
            if(pegs[peg]> pegs[peg-1]){
                tosses+=pegs[peg]-pegs[peg-1];
            }
        }
        return tosses;
    }

    
    public static void main(String[] args) {
        
		int[] pegs={0, 7, 4, 5, 7, 7, 5, 2, 1, 7, 1, 4, 2, 3, 2, 3, 0, 1, 0, 5, 0, 2, 1, 0, 2, 3, 4, 4, 5, 0, 3, 0, 0, 0, 1, 2, 7, 1, 1, 2, 3, 6, 0, 7, 4, 1, 2, 2, 2, 1};
    
        System.out.println(RingTossGreedy(pegs));
    }

}