package TB2_second_term.week_11.Ex3_p1;



import java.io.BufferedWriter;

import java.io.IOException;
import java.io.FileWriter;

public class Challenge
{
    public static void writeFile()
    {
        // implement your code here


        // implement your code here
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter("/myfiles/japi-io/writefile.txt"));


            file.write("Hello there.");
            file.write(System.lineSeparator()); //file.newline
            file.write("This is a file I made.");


            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
