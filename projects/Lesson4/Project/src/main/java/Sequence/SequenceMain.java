package Sequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class SequenceMain 
{

    private static List<Integer> list = new ArrayList<Integer>();

    public static void main( String[] args )
    {

        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            list.add(rand.nextInt(20));
        }

        System.out.println(list);


        
        //TODO: setup a list that contains a large list of values
        //TODO: Stream values and map them according to their key and value++
        //TODO: print frequencies
    }
}
