package GatewayTest.GateWayTest_2.Part_A;

public class Main {
	  	  	  	       		   	      	
		public static void main(String[] args) {	  	  	  	       		   	      	
		// This class and method is for testing your code	  	  	  	       		   	      	
		// You must run and therefore self-test your code to check it works as expected before you can test for a medal	  	  	  	       		   	      	
		// You are given some example test code that you can comment, uncomment and/or modify	  	  	  	       		   	      	
		// WARNING: If you 'break' this class then you will not be able to run your code	  	  	  	       		   	      	
		// If you cannot run your code then you will be unable to test for medals	  	  	  	       		   	      	
	  	  	  	       		   	      	
	  	  	  	       		   	      	
			Film f1 = new Film("Monsieur Hulot's Holiday", "Jacques Tati",114);	  	  	  	       		   	      	
			Film f2 = new Film("Dark Star", "John Carpenter", 83);	  	  	  	       		   	      	
			Film f3 = new Film("Eraserhead", "David Lynch",89);	  	  	  	       		   	      	
			Cinema c1 = new Cinema("Ritzy");	  	  	  	       		   	      	
	  	  	  	       		   	      	
			System.out.println(f1);	  	  	  	       		   	      	
			System.out.println(f2);	  	  	  	       		   	      	
			System.out.println(f3);	  	  	  	       		   	      	
			System.out.println(c1);	  	  	  	       		   	      	
			// the following line can be uncommented to test Q1 but comment it out again when testing Q4 read films	  	  	  	       		   	      	
			// c1.addFilm(f1);	  	  	  	       		   	      	
			System.out.println(c1); // when addFilm is working correctly this should give: Cinema{name=Ritzy, films=[Film{title=Monsieur Hulot's Holiday, director=Jacques Tati, length=114}]}	  	  	  	       		   	      	
			// the following 2 lines can be uncommented to test Q2 and Q1 and add multiple films. But you can comment them out again to test Q4 read films	  	  	  	       		   	      	
			// c1.addFilm(f2);	  	  	  	       		   	      	
		   //  c1.addFilm(f3);	  	  	  	       		   	      	
		   // the following line can be used to test Q2	  	  	  	       		   	      	
		   //System.out.println(c1.totalFilms());// should be 3 if Film f1, f2 and f3 have been added	  	  	  	       		   	      	
		   // the following line can be used to test Q3	  	  	  	       		   	      	
			//System.out.println(c1.totalLength());// should be 286 if Film f1, f2 and f3 have been added	  	  	  	       		   	      	
			// the following line can be used to test readFims NOTE: comment out the addFilm lines above to test this or you will have 6 films	  	  	  	       		   	      	
			//c1.readFilms("/myfiles/japi-io/Films.txt");	  	  	  	       		   	      	
			// Bronze should be	  	  	  	       		   	      	
			// Monsieur Hulot's Holiday,Jacques Tati,114	  	  	  	       		   	      	
			// Dark Star,John Carpenter,83	  	  	  	       		   	      	
			// Eraserhead,David Lynch,89	  	  	  	       		   	      	
			// Silver should be	  	  	  	       		   	      	
			//Monsieur Hulot's Holiday	  	  	  	       		   	      	
			//Jacques Tati	  	  	  	       		   	      	
			//114	  	  	  	       		   	      	
			//Dark Star	  	  	  	       		   	      	
			//John Carpenter	  	  	  	       		   	      	
			//83	  	  	  	       		   	      	
			//Eraserhead	  	  	  	       		   	      	
			//David Lynch	  	  	  	       		   	      	
			//89	  	  	  	       		   	      	
	  	  	  	       		   	      	
			System.out.println(c1);	  	  	  	       		   	      	
			// When Gold is working correctly the above should be: (NOTE comment out the addFilm lines above to test this or you will have 6 films)	  	  	  	       		   	      	
			// Cinema{name=Ritzy, films=[Film{title=Monsieur Hulot's Holiday, director=Jacques Tati, length=114}, Film{title=Dark Star, director=John Carpenter, length=83}, Film{title=Eraserhead, director=David Lynch, length=89}, Film{title=Monsieur Hulot's Holiday, director=Jacques Tati, length=114}, Film{title=Dark Star, director=John Carpenter, length=83}, Film{title=Eraserhead, director=David Lynch, length=89}]}	  	  	  	       		   	      	
	  	  	  	       		   	      	
	  	  	  	       		   	      	
		}	  	  	  	       		   	      	
	  	  	  	       		   	      	
	}	  	  	  	       		   	      	
	  	  	  	       		   	      	
	