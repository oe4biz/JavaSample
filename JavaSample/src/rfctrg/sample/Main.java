package rfctrg.sample;

import rfctrg.sample.Customer;
import rfctrg.sample.Movie;
import rfctrg.sample.Rental;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("Joe");

		Movie movie = new Movie("Doraemon", Movie.NEW_RELEASE);
		Rental rental = new Rental(movie, 10);

		Movie movie2 = new Movie("Konan", Movie.CHILDRENS);
		Rental rental2 = new Rental(movie2, 3);

		Movie movie3 = new Movie("Dragon Ball",  Movie.REGULAR);
		Rental rental3 = new Rental(movie3, 100);

		customer.addRental(rental);
		customer.addRental(rental2);
		customer.addRental(rental3);

		System.out.println(customer.statement());
		System.out.println();
		System.out.println(customer.htmlStatement());
	}

}
