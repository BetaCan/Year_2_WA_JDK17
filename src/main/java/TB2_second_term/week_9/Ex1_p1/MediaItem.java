package TB2_second_term.week_9.Ex1_p1;

public class MediaItem {
    private String title;

    //getters setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Constructors
    public MediaItem(String t)
    {
        setTitle(t);
    }

    @Override
    public boolean equals (Object obj){


        /////////////////// not using instance of //////////////////////
        if (this == obj) {
        return true;
        }

        if (obj == null || getClass() != obj.getClass()){
            // getClass checks what class the certain obj is
            // from in this instance it checks "obj" class with the class
            // that this code is written from
            return false;

        }

        MediaItem boohoo = (MediaItem) obj;
        // this is a type cast it tells the compiler to treat
        // the object "obj" as if it were a type "MediaItem"
        // This declares a new variable named boohoo of type MediaItem.
        // This variable will be used to refer to the object after type casting.




        return this.title != null &&
                this.title.trim().equalsIgnoreCase(boohoo.title != null ? boohoo.title.trim() :null);
        //return this.getTitle().toUpperCase().equals(boohoo.getTitle().toUpperCase());

    }
}