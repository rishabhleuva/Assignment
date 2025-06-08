#include<iostream>
using namespace std;

int globalvar = 100;

void globalexample()
{
	cout<<"Accessing global variable : "<<globalvar<<endl;
}

void localexample()
{
	int localvar = 25;
	cout<<"\nAccessing local variable of localexample : "<<localvar<<endl;
}

int main()
{
	int localvar = 20;
	cout<<"\nAccessing local variable of main function : "<<localvar<<endl;
	cout<<"\nAccessing global variable from main function : "<<globalvar<<endl;
	
	globalexample();
	localexample();
	
	return 0;
}
