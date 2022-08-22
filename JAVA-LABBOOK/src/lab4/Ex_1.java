package lab4;

class Person {
	String name;
	float age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}
	
}

class Account{
	long accNum;
	double balance;
	Person accHolder;
	
	Account() {

	}
	
	Account(long accNum, double balance, Person accHolder) {
		this.accNum=accNum;
		this.balance=balance;
		this.accHolder=accHolder;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}
	
	double getBalance() {
		return balance;
	}
	
	void deposit(double balance) {
		this.balance=this.balance+balance;
	}
	
	void withdrawl(double balance) {
		this.balance=this.balance-balance;
	}
	
}

class SavingsAccount extends Account{
	final double minimumBalance=500;
	Account a;
	
	SavingsAccount(Account a){
		super.accNum=a.accNum;
		super.balance=a.balance;
		super.accHolder=a.accHolder;
	}

	@Override
	void withdrawl(double balance) {
		if(super.balance-balance>=this.minimumBalance)
			super.balance=super.balance-balance;
	}
}

class currentAccount extends Account{
	double overdraftLimit;

	@Override
	void withdrawl(double balance) {
		if(balance<=overdraftLimit) {
			super.balance=super.balance-balance;
			System.out.println(true);
		}
		System.out.println(false);
	}
}

public class Ex_1 {
	public static void main(String[] args) {
		Person p1=new Person("Smith", 21);
		Person p2=new Person("Kathy",23);
		Account a1=new Account(345,2000,p1);
		Account a2=new Account(765,3000,p2);
		SavingsAccount s1=new SavingsAccount(a1);
		SavingsAccount s2=new SavingsAccount(a2);
		s1.deposit(2000);
		s2.withdrawl(2000);
		double d1=s1.getBalance();
		double d2=s2.getBalance();
		System.out.println("Smith's updated balancs is: "+d1);
		System.out.println("Kathy's updated balance is: "+d2);
	}
	
	}
