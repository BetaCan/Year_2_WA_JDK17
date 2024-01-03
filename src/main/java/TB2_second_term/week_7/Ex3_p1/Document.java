package TB2_second_term.week_7.Ex3_p1;

import java.util.ArrayList;
import java.util.Calendar;

public class Document
{
    private String name;
    private String author;
    private int priority;
    private ArrayList<Line> lines= new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void addWord(Word w){
        this.lines.get(lines.size()-1).getWords().add(w);

    }



    public void addLine(Line l) {
        lines.add(l);
    }

    public void generatePreview() {
        StringBuilder sb = new StringBuilder();

        for (Line l : lines) {
            for (Word w : l.getWords()) {
                if (w.isUnderlined()) sb.append("_");

                if (w.isBold()) sb.append("*");

                sb.append(w.getText());

                if (w.isBold() && !w.isUnderlined()) sb.append("* ");
                else if (w.isUnderlined() && !w.isBold()) sb.append("_ ");
                else if (w.isUnderlined() && w.isBold()) sb.append("*_ ");
                else sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
        // ensures that when both bold and underlined attributes are present,
        // the asterisk is appended first, followed by the underscore.
    }







    public int getNumberOfWords(){
        int count =0;
        for(Line l: lines) {
        count += l.getWords().size();
        }
        return count;
    }

    public int getNumberOfLines(){

        return this.lines.size(); // gets the size of the array
    }


}