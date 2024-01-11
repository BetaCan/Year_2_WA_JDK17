package TB2_second_term.week_10.Ex3_p1;

public class Board
{

    private  String [][] squares =new String [3][3];
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

        if (move.getXpos()< 1 || move.getXpos()> 3 ||
                move.getYpos()< 1 || move.getYpos()> 3 ||
                !squares[move.getXpos()-1][move.getYpos()-1].equals("#"))
            return "illegal";

        squares[move.getXpos()-1][move.getYpos()-1]= move.getPlayer();

        for (int y=0; y<3; y++)
        {
            if ((squares[0][y].equals("X") || squares[0][y].equals("O")) && squares[1][y].equals(squares[0][y]) && squares[2][y].equals(squares[0][y])) return squares[0][y];

        }

        for (int x=0; x<3 ; x++)
        {
          if(squares[x][0].equals("X") && squares[x][1].equals("X") && squares[x][2].equals("X"))  return "X";
        }


        for (int x=0; x<3 ; x++)
        {
            if(  squares[x][0].equals("O") && squares[x][1].equals("O") && squares[x][2].equals("O") )   return "O";
        }

        if (squares[0][0].equals("X") && squares[1][1].equals("X") && squares[2][2].equals("X")) return "X";
        if (squares[0][0].equals("O") && squares[1][1].equals("O") && squares[2][2].equals("O")) return "O";

        if (squares[0][2].equals("X") && squares[1][1].equals("X") && squares[2][0].equals("X")) return "X";
        if (squares[0][2].equals("O") && squares[1][1].equals("O") && squares[2][0].equals("O")) return "O";

        for (int x=0; x<3; x++)
        {
            for(int y =0; y<3; y++)
            {
                if (squares[x][y].equals("#")) return "continue";
            }

        }

        return "stalemate";
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