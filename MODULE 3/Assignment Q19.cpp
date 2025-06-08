#include<iostream>
using namespace std;

class BankAccount
{
	private:
		int balance;
	
	public:
		
		BankAccount(int initialbalance)
		{
			if(initialbalance>=0)
			{
				balance=initialbalance;
			}
			else
			{
				balance = 0;
				cout<<"\nInvalid balance, Balance set to 0. ";
				
			}
			
		}
		
		
		void deposit(int a)
		{
			if(a>0)
			{
				balance = balance + a;
			}
			else
			{
				cout<<"\nEnter valid amount ";
			}
			
		}
		void withdraw(int a)
		{
			
			if(a>0 && a<balance)
			{
				balance = balance - a;
			}
			else
			{
				cout<<"\nInsufficient Balance ";
			}
			
			
			
		}
		int getbalance()
			{
				return balance;
			}
			
	
	
};


int main()
{
	BankAccount c(0);
	int b,d;
	cout<<"\nEnter amount to be deposited ";
	cin>>b;
	c.deposit(b);
	
	cout<<"\nEnter amount to be Withdrawn ";
	cin>>d;
	c.withdraw(d);
	
	
	int cb = c.getbalance();
	cout<<"\nCurrent Balance = "<< cb;
	
	
	return 0;
}
