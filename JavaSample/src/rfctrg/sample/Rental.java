package rfctrg.sample;

public class Rental {
	private Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	/**
	 * 1行ごとに金額計算
	 * @param aRental
	 * @return
	 */
	double getCharge() {
		return _movie.getCharge(_daysRented);
	}

	int getFrequentRenterPoints() {
		return _movie.getFrequentRenterPoints(_daysRented);
	}

}
