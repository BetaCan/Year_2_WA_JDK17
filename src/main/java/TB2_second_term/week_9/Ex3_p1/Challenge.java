package TB2_second_term.week_9.Ex3_p1;

import java.util.Arrays;



public class Challenge {


    public static String[] uniquesJava8(String[] arr) {
        // Convert array to stream
        return Arrays.stream(arr)
                // Removes duplicate from stream
                .distinct()
                // Collects unique elements into new array of type String[]
                .toArray(String[]::new);
    }


}

