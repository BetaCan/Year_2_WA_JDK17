package GatewayTest.GateWayTest_2.Part_A;

import GatewayTest.SteamTrip_GWT_2.Part_B.Gold.SteamTrip;
import TB2_second_term.week_11.Ex1_p1.Task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Cinema{

	// You will need to modify this class to answer the questions Q1, Q2, Q3, Q4
	// Each question will require you to define a Method
	// This is specified in the UML and the method specification

	private String name;
	private ArrayList<Film> films;

	@Override
	public String toString() {
		return "Cinema{" + "name=" + name + ", films=" + films + "}";
	}

	public Cinema() {
		this.name = "MyCinema";
		this.films = new ArrayList<>();
	}

	public Cinema(String name) {
		this.name = name;
		this.films = new ArrayList<>();
	}


	public int totalFilms()
	{
		return films.size();
	}


	public int totalLength()
	{
		int total=0;
		for(Film f : films)
		{
			for(int i=0; i<films.size(); i++){
			total= f.getLength()+total;}
		}
		return total;
	}

	public void readFilms(String pathname)
	{
		// implement your code here for gold

		try {
			BufferedReader file = new BufferedReader(new FileReader(pathname));

			String line;

			while ((line = file.readLine()) != null) {

				String[] store = line.split(",");
				Film f=new Film();
				f.setTitle(store[0]);
				f.setLength(Integer.parseInt(store[2]));
				f.setDirector(store[1]);
				films.add(f);


			}

			file.close();

		} catch (
				IOException e) {
			e.printStackTrace();
		}
	}



	public void addFilm (Film film)
	{
		this.films.add(film);
	}


	/**
	 * Get the value of films
	 *
	 * @return the value of films
	 */
	public ArrayList<Film> getFilms() {
		return films;
	}

	/**
	 * Set the value of films
	 *
	 * @param films new value of films
	 */
	public void setFilms(ArrayList<Film> films) {
		this.films = films;
	}

	/**
	 * Get the value of name
	 *
	 * @return the value of name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the value of name
	 *
	 * @param name new value of name
	 */
	public void setName(String name) {
		this.name = name;
	}

}

