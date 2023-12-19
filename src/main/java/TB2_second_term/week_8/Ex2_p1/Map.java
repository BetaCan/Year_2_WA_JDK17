package TB2_second_term.week_8.Ex2_p1;


public class Map
{
    // you may implement any class attributes you see fit, but do not implement
    // a constructor.

    private String[] keys=new String[10];
    private String[] values = new String[10];
    private int size = 0;

    // Puts an item into the map assigned to the specified key
    public void put(String key, String value)
    {
        // implement your code here
        values[0]= value;
        keys[size]= key;
        values[size]=value;
        size++;

    }

    // Retrieves the item from the map item using the key.
    public String get(String key)
    {
        // implement your code here
        for(int i = 0; i<size;i++)
        {
             if(keys[i].equals(key))
             {
                 return values[i];
             }
        }
        return null;
    }

}