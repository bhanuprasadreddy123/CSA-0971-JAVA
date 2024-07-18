import java.util.*;
class Day4_Bank_balance
{
	String Name;
	String Accno;
	String Type;
	int balance=10000,damount,wamount;
	void read(String n1,String a1,String t1)
	{
		Name=n1;
		Accno=a1;
		Type=t1;
	}
	void deposit(int d1)
	{
		damount=d1;
		balance=balance+damount;
		System.out.println("THE BALANCE AFTER DEPOSIT IS "+balance);
	}
	void withdraw(int w2)
	{
		wamount=w2;
		balance=balance-wamount;
		System.out.println("THE BALANCE AFTER WITHDRAW IS "+balance);
	}
	public static void main(String arg[])
	{
		Bank_balance b1=new Bank_balance();
		b1.read("AVINASH","12345667","SAVINGS");
		b1.deposit(500);
		b1.withdraw(700);
	}
}
	