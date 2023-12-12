package entities;

public class Individual extends TaxPayers {

	private Double healthExpenditures;

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if (getAnualIncome() < 20000.0) {
			return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
		}
		else {
			return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
		}
	}
	
	/* private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double sum = 0.0;
		if (getAnualIncome() < 20000.0) {
			sum = (getAnualIncome() * 15 / 100) - (healthExpenditures * 50 / 100);
		} else {
			sum = (getAnualIncome() * 25 / 100) - (healthExpenditures * 50 / 100);
		}
		return sum;
	}
	*/
}
