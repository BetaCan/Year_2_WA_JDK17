package TB2_second_term.week_10.Ex3_p1;

public class Main
{
    public static void main(String[] args) {

        Board b=new Board();
        System.out.println(b);
        System.out.println(b.placeMove(new Square ("0", 1, 1)));
        System.out.println(b.placeMove(new Square ("0", 2, 2)));
        System.out.println(b.placeMove(new Square ("0", 3, 3)));

    }
}
