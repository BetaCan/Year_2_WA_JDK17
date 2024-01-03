package TB2_second_term.week_9.Ex3_p1;

public class Main
{
    public static void main(String[] args)
    {
        String[] test1 = {"one","two","two","three","three","one","bumpers"};
        String[] results = Challenge.uniquesJava8(test1);

        System.out.println(results.length);
        System.out.println(results[0]);
        System.out.println(results[1]);
        System.out.println(results[2]);
        System.out.println(results[3]);


        // should get:
        // 4 - size of set
        // one
        // two
        // three
        // bumpers
    }
}