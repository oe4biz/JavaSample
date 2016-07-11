package rfctrg.sample;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String _name;
	private Vector _rentals = new Vector<String>();

	public Customer(String name){
		_name = name;
	}

	public void addRental(Rental rental) {
		_rentals.add(rental);
	}

	public String getName() {
		return _name;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		String result = "Rental Record for " + getName() + "\n";
		Enumeration rentals = _rentals.elements();

		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = (Rental) rentals.nextElement();

			//1行ごとに金額計算
			switch (each.getMovie().getPriceCode()) {
			case Movie.REGULAR:
				thisAmount = 2;
				if (each.getDaysRented() > 2) {
					thisAmount += (each.getDaysRented() - 2) * 1.5;
				}
				break;

			case Movie.NEW_RELEASE:
				thisAmount += each.getDaysRented()  * 3;

				break;
			case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (each.getDaysRented() > 3) {
					thisAmount += (each.getDaysRented() -3 ) * 1.5;
				}

				break;
			}

			//レンタルポイント加算
			frequentRenterPoints++;
			//新作を二日以上借りた場合はボーナスポイント
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
					each.getDaysRented() > 1) frequentRenterPoints++;

			//この貸し出しに関する数値の表示
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}

		//フッタ部分の追加
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";

		return result;
	}
}
