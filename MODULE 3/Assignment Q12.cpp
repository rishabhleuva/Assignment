#include<iostream>
using namespace std;
int main()
{
	int a,b;
	cout<<"\nEnter the first number ";
	cin>>a;
	cout<<"\nEnter the second number ";
	cin>>b;
	cout<<"\nEnter 1 for addition "<<endl;
	cout<<"Enter 2 for multiplication "<<endl;
	cout<<"Enter 3 for substraction "<<endl;
	cout<<"Enter 4 for division "<<endl;
	int choice;
	cin>>choice;
	switch(choice)
	{
		case 1:
			cout<<"\nThe addition of both numbers are "<<a+b<<endl;
		break;
		case 2:
			cout<<"\nThe multiplication of both numbers are "<<a*b<<endl;
		break;
		case 3:
			cout<<"\nThe substraction of both numbers are "<<a-b<<endl;
		break;
		case 4:
			cout<<"\nThe division of both numbers are "<<a/b<<endl;
		break;	
		
	}
	
	
	return 0;
}
