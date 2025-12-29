package com.methodreferencing;

public class Sarav {

	public static void main(String[] args) {
		MovieInfo m1 = new MovieInfo("Mr.India","Mugambo Khush Hua","Anil Kapoor",7);
		//Movie2 mov = MovieInfo::dakhava;  static method
		Movie2 mov = m1::dakhava; //instance method
		mov.movie_details(m1);
		
		//constructor referencing
		MovieInfo m2 = new MovieInfo("URI","How's the josh","Vicky Kaushal",9);
		Movie2 mov1 = MovieInfo::new;
		mov1.movie_details(m2);
	}
}
