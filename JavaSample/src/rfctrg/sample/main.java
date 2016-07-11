package rfctrg.sample;

public class main {

	public static void main(String[] args) {
		Customer customer = new Customer("Joe");

		Movie movie = new Movie("Doraemon", 1);
		Rental rental = new Rental(movie, 10);

		Movie movie2 = new Movie("Konan", 2);
		Rental rental2 = new Rental(movie2, 3);

		Movie movie3 = new Movie("Dragon Ball", 0);
		Rental rental3 = new Rental(movie3, 100);

		customer.addRental(rental);
		customer.addRental(rental2);
		customer.addRental(rental3);

		System.out.println(customer.statement());

	}

}
