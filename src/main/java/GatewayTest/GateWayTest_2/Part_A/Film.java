package GatewayTest.GateWayTest_2.Part_A;

public class Film {
		// NOOBLAB READONLY	  	  	  	       		   	      	
        // You are not to allowed to change the code in this class	  	  	  	       		   	      	
        // It is used by the other classes 'as is'	  	  	  	       		   	      	
		// Note that the only difference in Film.java from Gateway 1 is Overriding the toString method	  	  	  	       		   	      	
		// This allows you to directly print a representation of a Film object for debugging purposes	  	  	  	       		   	      	
	  	  	  	       		   	      	
		 private String title;	  	  	  	       		   	      	
		 private String director;	  	  	  	       		   	      	
		 private int length;	  	  	  	       		   	      	
		   @Override	  	  	  	       		   	      	
		   public String toString() {	  	  	  	       		   	      	
			   return "Film{" + "title=" + title + ", director=" + director + ", length=" + length + "}";	  	  	  	       		   	      	
		   }	  	  	  	       		   	      	
	  	  	  	       		   	      	
	  	  	  	       		   	      	
		 public Film() {	  	  	  	       		   	      	
		   this.director = "Unknown";	  	  	  	       		   	      	
		   this.title = "Unknown";	  	  	  	       		   	      	
		   this.length = 0;	  	  	  	       		   	      	
	  	  	  	       		   	      	
		 }	  	  	  	       		   	      	
	  	  	  	       		   	      	
		 public Film(String title, String director, int length) {	  	  	  	       		   	      	
		   this.title = title;	  	  	  	       		   	      	
		   this.director = director;	  	  	  	       		   	      	
		   if (length < 0) {	  	  	  	       		   	      	
			 this.length = 0;	  	  	  	       		   	      	
		   }	  	  	  	       		   	      	
		   else {	  	  	  	       		   	      	
			 this.length = length;	  	  	  	       		   	      	
		   }	  	  	  	       		   	      	
		 }	  	  	  	       		   	      	
	  	  	  	       		   	      	
	  	  	  	       		   	      	
		 public void setTitle(String title)	  	  	  	       		   	      	
		 {	  	  	  	       		   	      	
			this.title = title;	  	  	  	       		   	      	
		 }	  	  	  	       		   	      	
	  	  	  	       		   	      	
		 public String getTitle()	  	  	  	       		   	      	
		 {	  	  	  	       		   	      	
			return this.title;	  	  	  	       		   	      	
		 }	  	  	  	       		   	      	
	  	  	  	       		   	      	
	  	  	  	       		   	      	
		 public void setDirector(String director)	  	  	  	       		   	      	
		 {	  	  	  	       		   	      	
			this.director = director;	  	  	  	       		   	      	
		 }	  	  	  	       		   	      	
	  	  	  	       		   	      	
		 public String getDirector()	  	  	  	       		   	      	
		 {	  	  	  	       		   	      	
			return this.director;	  	  	  	       		   	      	
		 }	  	  	  	       		   	      	
	  	  	  	       		   	      	
		 public void setLength(int length)	  	  	  	       		   	      	
		 {	  	  	  	       		   	      	
		   if (length < 0) {	  	  	  	       		   	      	
			 this.length = 0;	  	  	  	       		   	      	
		   }	  	  	  	       		   	      	
		   else {	  	  	  	       		   	      	
			 this.length = length;	  	  	  	       		   	      	
		   }	  	  	  	       		   	      	
		 }	  	  	  	       		   	      	
	  	  	  	       		   	      	
		 public int getLength()	  	  	  	       		   	      	
		 {	  	  	  	       		   	      	
			return this.length;	  	  	  	       		   	      	
		 }	  	  	  	       		   	      	
	   }	  	  	  	       		   	      	
	  	  	  	       		   	      	
