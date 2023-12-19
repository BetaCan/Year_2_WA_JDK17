package TB2_second_term.week_11.Ex1_p1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Challenge
{
    private static List<Task> tasks = new ArrayList();

    public static void readCSVFile(String filename)
    {
        // implement your code here
        //Revise for Gateway Test,1,2020-11-23
        //Get the heck outta here,2,2020-12-11

        /*

        //t1
        Task t1 = new Task();
        t1.setTitle("Revise for Gateway Test");
        t1.setPriority(1);
        t1.setTargetDate(LocalDate.parse("2020-11-23"));
        System.out.println(t1);

        //t2
        Task t2 = new Task();
        t1.setTitle("Get the heck outta here");
        t1.setPriority(2);
        t1.setTargetDate(LocalDate.parse("2020-12-11"));
        System.out.println(t2);

        //adding to the list
        tasks.add(t1);
        tasks.add(t2);
        System.out.println("-------------");
        System.out.println(tasks);


         */

        try(
        FileReader file = new FileReader("/myfiles/japi-io/tasks.csv");
        BufferedReader b = new BufferedReader(file);
        ) {

            while(b.ready())
            {

                String line = b.readLine();
                String[] fields = line.split(",");
                if(fields.length==3){
                    Task t = new Task();
                    t.setTitle(fields[0]);
                    t.setPriority(Integer.parseInt(fields[1]));
                    t.setTargetDate(fields[2]);
                    System.out.println(t);
                    tasks.add(t);
                }

            }



            /*
            String line;
            String[] field = new String[0];
            while (( line = b.readLine()) != null) {
                field = line.split(",");

                //System.out.println(line);
                for (String fields :field){
                    System.out.println(fields);
                }

            }

          /*  Task t = new Task();
            t.setTitle(field[0]);
            t.setPriority(Integer.parseInt(field[1]));
            t.setTargetDate(LocalDate.parse(field[2]));
            System.out.println(t);



            for (int i = 0; i < field.length; i += 3) {
                Task t = new Task();
                t.setTitle(field[i]);
                t.setPriority(Integer.parseInt(field[i + 1]));
                t.setTargetDate(field[i + 2]);
                System.out.println(t);

                if (i + 3 < field.length) {
                    Task t2 = new Task();
                    t2.setTitle(field[i + 3]);
                    t2.setPriority(Integer.parseInt(field[i + 4]));
                    t2.setTargetDate(field[i + 5]);
                    System.out.println(t2);

                 }
            }

           */

        }  catch(Exception e){
            e.printStackTrace();

        }





    }

    public static List<Task> getTasks(){
        return tasks;
    }

    public static void setTasks(List<Task> tasks){
        Challenge.tasks = tasks;
    }
}