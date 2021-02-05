package Sequence;

import java.util.ArrayList;
import java.util.List;

public class LongestSequence {
    int start;
    int end;
    int len;
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
        this.len = start + end;
    }

    private List<Integer> longSeq(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.size() >= 1) {
                return list;
            }
            else if(list.get(i) < list.get(i++)) {
                setStart(list.indexOf(i));
            }
            else {
                setEnd(list.indexOf(i));
                setLen();
                lens.add(new LongestSequence(getStart(), getEnd(), getLen()));
            }
            for (LongestSequence seq : list) {
                
            }
        }
    }


    private Boolean longer(LongestSequence seq) {

    }

    
}
