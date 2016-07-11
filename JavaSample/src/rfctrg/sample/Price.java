package rfctrg.sample;

public abstract class Price {
	abstract int getPriceCode();

	/**
	 * 1行ごとに金額計算
	 * @param aRental
	 * @return
	 */
	abstract double getCharge(int daysRented);

	int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}
