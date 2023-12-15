package week_8.Ex1_p1;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;

public class Challenge
{
    public static String[] uniques(String[] arr)
    {
        // implement your code here

        HashSet<String> output = new HashSet<String>();
        output.addAll(Arrays.asList(arr));
        return output.toArray(new String[0]);
        // (new String[0]) this creates an empty array of
        // Strings, the size of the array is 0 because no
        // elements are specified.
        //
        // this is usually done to convert a collection


    }
}