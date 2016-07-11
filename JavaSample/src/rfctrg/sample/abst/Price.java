package rfctrg.sample.abst;

public abstract class Price {
	public abstract int getPriceCode();

	/**
	 * 1行ごとに金額計算
	 * @param aRental
	 * @return
	 */
	public abstract double getCharge(int daysRented);

	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}
