package rfctrg.sample;

import java.util.ArrayList;
import java.util.List;

import rfctrg.sample.Rental;

public class Customer {
	private String _name;
	private List<Rental> _rentals;

	public Customer(String name){
		_name = name;
		_rentals = new ArrayList<Rental>();
	}

	public void addRental(Rental rental) {
		_rentals.add(rental);
	}

	public void addRentals(List<Rental> rentals) {
		_rentals = rentals;
	}

	public String getName() {
		return _name;
	}

	public String stt() {
		String result = "Rental Record for " + getName() + "\n";
		//Enumeration rentals = _rentals.elements();
		for (Rental rental : this._rentals) {

			//この貸し出しに関する数値の表示
			result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
		}

		//フッタ部分の追加
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getFrequentRenterPoints()) + " frequent renter points";

		return result;
	}

	public String htmlStt() {
		String result = "<H1>Rental Record for <EM>" + getName() + "</EM></H1><p>\n";
		for (Rental rental : this._rentals) {
			//この貸し出しに関する数値の表示
			result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "<BR>\n";
		}

		//フッタ部分の追加
		result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
		result += "On this rental you earned <EM>" + String.valueOf(getFrequentRenterPoints()) + "</EM> frequent renter points<P>";

		return result;
	}

	public double getTotalCharge() {
		double result = 0;

		for (Rental rental : this._rentals) {
			result += rental.getCharge();
		}

		return result;
	}

	public int getFrequentRenterPoints() {
		int result = 0;

		for (Rental rental : this._rentals) {
			result += rental.getCharge();
		}

		return result;
	}
}
