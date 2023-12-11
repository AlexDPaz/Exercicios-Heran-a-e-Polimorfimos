package entities;

public class Company extends TaxPayers {
	
	private Integer employee;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer employee) {
		super(name, anualIncome);
		this.employee = employee;
	}

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}

	@Override
	public double tax() {
		double sum = 0.0;
		if (employee <= 10) {
			sum = getAnualIncome() * 16 /100;
		}
		else {
			sum = getAnualIncome() * 14 /100;
		}
		return sum;
	}
	
																					
}