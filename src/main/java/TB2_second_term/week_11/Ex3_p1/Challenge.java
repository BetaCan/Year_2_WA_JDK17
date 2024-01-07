package TB2_second_term.week_11.Ex3_p1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Challenge
{
    public static void writeFile()
    {
        // implement your code here


        // implement your code here
        try {
            BufferedReader file = new BufferedReader(new FileReader("/myfiles/japi-io/readfile.txt"));
            String line;

            while((line = file.readLine())!= null){
                System.out.println(line);
            }

            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
