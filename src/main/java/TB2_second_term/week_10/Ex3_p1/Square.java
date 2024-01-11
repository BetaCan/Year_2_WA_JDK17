package TB2_second_term.week_10.Ex3_p1;

public class Square {
    private String player;
    private int xpos;
    private int ypos;

    public Square (String player, int xpos ,int ypos)
    {
        this.player=player;
        this.xpos=xpos;
        this.ypos=ypos;
    }



    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getXpos() {
        return xpos;
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }
}
