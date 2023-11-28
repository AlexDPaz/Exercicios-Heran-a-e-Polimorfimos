package entities;

public class SavingsAccount extends Account {

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer nunber, String holder, Double balance, Double interestRate) {
		super(nunber, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updatealance() {
		balance += balance * interestRate;
	}

	@Override
	public void withdraw(Double amount) {
		balance -= amount;
	}
}
