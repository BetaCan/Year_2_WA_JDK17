package TB2_second_term.week_7.Ex3_p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Line {

    private ArrayList<Word> words= new ArrayList();


    public Word getWord(int i){

        return words.get(i-1);
    }

    public int getNumberOfWords() {
        return words.size();
    }


    public Line(String content) {
        String[] wordsArray = content.split(" ");
        for (String w : wordsArray) {
            words.add(new Word(w));
        }
    }



    public Line(Word[] content) {
        words.addAll(Arrays.asList(content));

    }

    public void addWord(Word w){
        this.words.add(w);

    }

    public ArrayList<Word> getWords(){
        return words;
    }


    public void setWords(ArrayList<Word>words){
        this.words=words;
    }
}
