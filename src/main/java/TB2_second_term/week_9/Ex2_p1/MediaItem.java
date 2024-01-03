package TB2_second_term.week_9.Ex2_p1;

public class MediaItem {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public MediaItem(String t)
    {
        setTitle(t);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        MediaItem boohoo = (MediaItem) obj;

        // Extracting the title from the current object and converting it to lowercase after trimming
        String poke = this.title != null ? this.title.trim().toLowerCase() : null;

        // Extracting the title from the 'boohoo' object and converting it to lowercase after trimming
        String mon = boohoo.title != null ? boohoo.title.trim().toLowerCase() : null;

        // Explanation for the first line:
        // - 'this.title != null' checks if the 'title' attribute of the current object is not null
        // - If true, '? this.title.trim().toLowerCase()' is executed:
        //   - 'this.title.trim()' removes leading and trailing whitespaces from the title
        //   - 'toLowerCase()' converts the title to lowercase
        // - If false, ': null' is executed, assigning null to 'poke'

        // Explanation for the second line:
        // - 'boohoo.title != null' checks if the 'title' attribute of the 'boohoo' object is not null
        // - If true, '? boohoo.title.trim().toLowerCase()' is executed:
        //   - 'boohoo.title.trim()' removes leading and trailing whitespaces from the title
        //   - 'toLowerCase()' converts the title to lowercase
        // - If false, ': null' is executed, assigning null to 'mon'

        // this.tile != null  is a condition being checked. it checks if it's not null

        // this.title.trim().toLOWERcase() is an eperession to be evaluated if the
        // condition is false then it will simply align null to "thisTitle"

        // :null this is the expression to be evaluated if the condition is false

        return poke == null ? mon == null : poke.equals(mon);
    }

    @Override
    public int hashCode() {
        return title != null ? title.trim().toLowerCase().hashCode() : 0;
    }



}