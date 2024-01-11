package TB2_second_term.week_10.Ex3_p1;

public class Board
{

    private String [][] squares =new String [3][3];
    public Board ()
    {
        for (int y=0; y<3 ; y++)
        {
            for (int x=0 ; x<3 ; x++)
            {
                this.squares[x][y]= "#";
            }
        }
    }

    public String placeMove (Square move) {

        if (move.getXpos() < 1 || move.getXpos() > 3 || move.getXpos() < 1 || move.getXpos() > 3 || squares[move.getXpos() - 1][move.getYpos() - 1].equals("#"))
            return "illegal";


    }

    @Override
    public String toString()
    {
        StringBuilder sb =new StringBuilder();
        for (int y=0; y<3 ; y++)
        {
            for (int x=0 ; x<3 ; x++)
            {
                sb.append("(").append(x).append(",").append(y).append(")");
                sb.append( this.squares[x][y]);
            }
            sb.append(System.lineSeparator());

        }
        return sb.toString();
    }




}