package TB2_second_term.week_11.Ex2_p1;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Challenge
{
    public static void readFile()
    {
        // implement your code here
        try {
            BufferedReader infile = new BufferedReader(new FileReader("\"/myfiles/japi-io/tasks.csv\""));
            String word = infile.readLine();
            infile.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}