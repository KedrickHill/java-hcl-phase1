package Sequence;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestSequence  {
    int start = 0;
    int end = 0;
    int len = 0;
    List<LongestSequence> lens = new ArrayList<LongestSequence>();

    public LongestSequence(int start, int end, int len) {
        this.start = start;
        this.end = end;
        this.len = len;
    }
    public LongestSequence() {
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getLen() {
        return len;
    }

    public void setLen() {
        this.len = (end - start) + 1;
    }

    /**
     * longestSeq takes a list of integers and looks through the list for all subsequences and 
     * stores them in a class ArrayList. Finally it sorts the list and retrieves the last
     * sequence and returns it.
     * 
     * @param list - randomized list from main
     * @return - longest subsequence from list
     */
    public LongestSequence longestSeq(List<Integer> list) {
        LongestSequence longSeq = new LongestSequence(0,0,0);
        for (int i = 0; i < list.size() - 1; i++) {

            // System.out.println("Current Index: " + (i+1));
            // System.out.println("CHECKING: " + list.get(i) + " > " + list.get(i+1));

            //base case: end of the list
            if (list.isEmpty()) {
               return longSeq;
            }
            // when next.index is null then add remaining sequence and break
            else if (list.get(i).equals(list.size()-1)) {
                setEnd(i++);
                setLen();
                lens.add(new LongestSequence(getStart(), getEnd(), getLen()));
            }
            //check values for descending trait
            else if(list.get(i) >= list.get(i+1)) {
                setEnd(i);
                setLen();
                lens.add(new LongestSequence(getStart(), getEnd(), getLen()));
                setStart(i+1);           
            }
            else
                continue;
        }
        
        List<LongestSequence> sortedLens = lens.stream().sorted(Comparator.comparing(LongestSequence::getLen)).collect(Collectors.toList());
    

        // // use this to see all subsequences sorted by length
        // for (LongestSequence s : sortedLens) {
        //     System.out.println("\nThe Start of this sequence: " + s.getStart());
        //     System.out.println("The End of this sequence: " + s.getEnd());
        //     System.out.println("The length of this sequence: " + s.getLen());
        // }

        longSeq = sortedLens.get(sortedLens.size()-1);
        return longSeq;
    }    

    

}
