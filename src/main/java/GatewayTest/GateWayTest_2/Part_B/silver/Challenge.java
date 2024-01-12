package GatewayTest.GateWayTest_2.Part_B.silver;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
      public class Challenge	  	  	  	       		   	      	
      {	  	  	  	       		   	      	
      // do not modify the following attribute definition	  	  	  	       		   	      	
       private static ArrayList<String> stringList = new ArrayList();	  	  	  	       		   	      	
	  	  	  	       		   	      	
       public static void createSteamTripStrings()	  	  	  	       		   	      	
        {	  	  	  	       		   	      	
        // implement your code here silver
            try {
                BufferedReader file = new BufferedReader(new FileReader("/myfiles/japi-io/SteamTrips.txt"));

                String line;

                while ((line = file.readLine()) != null) {

                        stringList.add(line);
                }

                file.close();

            } catch (
                    IOException e) {
                e.printStackTrace();
            }
        }

        // do not modify stringList getter	  	  	  	       		   	      	
        public static ArrayList<String> getStringList()	  	  	  	       		   	      	
          {	  	  	  	       		   	      	
          return Challenge.stringList;	  	  	  	       		   	      	
          }	  	  	  	       		   	      	
	  	  	  	       		   	      	
}


