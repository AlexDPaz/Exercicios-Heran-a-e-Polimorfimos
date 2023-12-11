package entities;

public abstract class TaxPayers {
	
	private String name;
	private Double AnualIncome;
	
	public TaxPayers() {
	}

	public TaxPayers(String name, Double anualIncome) {
		super();
		this.name = name;
		AnualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return AnualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		AnualIncome = anualIncome;
	}
	
	public abstract double tax();

}
