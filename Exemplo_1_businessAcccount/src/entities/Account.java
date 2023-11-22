package entities;

public class Account {
	
	private Integer nunber;
	private String holder;
	protected Double balance;
	
	public Account() {
	}

	public Account(Integer nunber, String holder, Double balance) {
		this.nunber = nunber;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNunber() {
		return nunber;
	}

	public void setNunber(Integer nunber) {
		this.nunber = nunber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void withdraw(Double amount) {
		balance -= amount;
	}
	
	public void deposit (Double amount) {
		balance += amount;
	}
}
