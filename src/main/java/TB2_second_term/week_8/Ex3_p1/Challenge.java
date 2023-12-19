package TB2_second_term.week_8.Ex3_p1;

import java.util.Map;
import java.util.Set;

public class Challenge {


        public static String[] mapKeysToArray(Map<String,Integer> map)
        {
            // implement your code here

            Set<String> keySet = map.keySet();

            String[] keysArray = keySet.toArray(new String[0]);
            return keysArray;
        }

}
