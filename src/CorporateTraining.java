//Class inheriting Training
public class CorporateTraining extends Training {

	private int days;

	// Constructor of this class
	public CorporateTraining(int id, String subject, int fees, int days) {
		super(id, subject, fees);
		this.days = days;
	}

	// method created to return the fees
	public int getOrderValues() {

		return (getFees() * days);
	}

}
