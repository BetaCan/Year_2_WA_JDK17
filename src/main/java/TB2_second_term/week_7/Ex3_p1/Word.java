package TB2_second_term.week_7.Ex3_p1;

public class Word {
    private boolean underlined;
    private boolean bold;

    private String text;

    public Word(String text) {
        this.text=text;
    }

    public boolean isUnderlined() {
        return underlined;
    }

    public void setUnderlined(boolean underlined) {
        this.underlined = underlined;
    }

    public boolean isBold() {
        return bold;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
