package TB2_second_term.week_7.Ex3_p1;

import java.util.ArrayList;

public class Document
{
    private String name;
    private String author;
    private int priority;
    private ArrayList<Line> lines;

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

    }
    public void addLine(Line l) {
    }

    public void generatePreview(){


    }

    public int getNumberOfWords(){

        return 0;
    }

    public int getNumberOfLines(){

        return 0;
    }


}