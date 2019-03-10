package model;

public class User {
	
	private String companyName;
	private String address;
	private double nip;
	private int bankAccount;
	
	public User(String companyName, String address, double nip, int bankAccount) {
		this.companyName = companyName;
		this.address = address;
		this.nip = nip;
		this.bankAccount = bankAccount;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getNip() {
		return nip;
	}

	public void setNip(double nip) {
		this.nip = nip;
	}

	public int getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}
	

}
