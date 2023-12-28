package TB2_second_term.week_7.Ex3_p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Line {

    private List<Word> words;


    public Word getWord(int i){

        return words.get(i-1);
    }

    public int getNumberOfWords(Word w){

        return words.size();
    }

    public Line (String content) {

    }


    public Line(Word[] content) {
        words = Arrays.asList(content);

    }

    public void addWord(Word w){
        this.words.add(w);

    }

    public ArrayList<Word> getWords(){


        return null;
    }


    public void setWords(ArrayList<Word>words){
        this.words=words;
    }
}
