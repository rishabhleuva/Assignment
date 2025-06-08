#include<iostream>
using namespace std;
class calculator
{
	public:
	void addition(int a,int b)
	{
		cout<<"\nAddition of a and b is "<<a+b;	
	}	
	void multiplication(int a, int b)
	{
		cout<<"\nMultiplication of a and b is "<<a*b;
	}
	void substraction(int a,int b)
	{
		cout<<"\nSubstraction of a and b is "<<a-b;
	}
	void division(int a, int b)
	{
		if(b==0)
		{
			cout<<"\nDivision by zero is not possible ";
		}
		else
		{
			cout<<"\nDivision of a and b is "<<float(a)/float(b);
		}
	}
};
int main()
{
	int n1,n2,choice;
	calculator c;

	do
	{
		cout<<"\n------------Calculator------------"<<endl;
		cout<<"\nEnter 1 for addition \nEnter 2 for multiplication \nEnter 3 for substraction \nEnter 4 for Division \nEnter 5 to Exit ";
		cin>>choice;
		
		cout<<"\nEnter the value of a ";
		cin>>n1;
		cout<<"\nEnter the value of b ";
		cin>>n2;
		
		
		if(choice==5)
		{
			cout<<"Exiting the program... ";
			break;
		}
		switch(choice)
		{
			case 1:
				c.addition(n1,n2);
			break;
			case 2:
				c.multiplication(n1,n2);
			break;
			case 3:
				c.substraction(n1,n2);
			break;
			case 4:
				c.division(n1,n2);
			break;
			default:
				cout<<"Invalid Input ";
			break;
		}
		
	}
	while(true);
	
	
}
