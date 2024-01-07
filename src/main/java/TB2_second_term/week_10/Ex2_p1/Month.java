package TB2_second_term.week_10.Ex2_p1;

public class Month
{
    private static String[] monthnames = {
            "January","February","March","April","May","June","July","August",
            "September","October","November","December"
    };

    public static String getMonth(int monthno)
    {
        try {
            return monthnames[monthno-1];
        } catch (ArrayIndexOutOfBoundsException e){
            return "illegal";
        }
    }
}