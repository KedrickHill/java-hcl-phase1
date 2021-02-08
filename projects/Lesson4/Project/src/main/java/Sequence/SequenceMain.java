package Sequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SequenceMain 
{

    private static List<Integer> list = new ArrayList<Integer>();

    public static void main( String[] args )
    {

        Random rand = new Random();

        for (int i = 0; i < 100000; i++) {
            list.add(rand.nextInt(10001));
        }

        // // uncomment if you want to see the entire list
        // System.out.println(list);

        System.out.println("Length of the List: " + list.size());

        LongestSequence lgs = new LongestSequence();

        lgs = lgs.longestSeq(list);

        System.out.println("\nLongest Sequence Starts at: " + lgs.getStart());
        System.out.println("Longest Sequence Ends at: " + lgs.getEnd());
        System.out.println("Longest Sequence has a Length of: " + lgs.getLen());

        System.out.println("\nThe Subsequence: " + list.subList(lgs.getStart(), lgs.getEnd()));
    }
}
