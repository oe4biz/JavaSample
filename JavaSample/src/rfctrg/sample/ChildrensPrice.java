package rfctrg.sample;

import rfctrg.sample.abst.Price;

public class ChildrensPrice extends Price{

	@Override
	public int getPriceCode() {
		return Movie.CHILDRENS;
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 1.25;
		if (daysRented > 3) {
			result += (daysRented -3 ) * 1.25;
		}
		return result;
	}
}
