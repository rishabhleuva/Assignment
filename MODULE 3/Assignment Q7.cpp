#include<iostream>
using namespace std;
int main()
{
	//Arithmetic operator
	int a = 10,b=20;
	cout<<"Addition of a and b is "<<a+b<<endl;
	cout<<"Multiplication of a and b is "<<a*b<<endl;
	
	//Relational operator
	cout<<"\na == b: "<<(a == b)<<endl;
	cout<<"a>=b: "<<(a<=b)<<endl;

	//Logical operator
	int c = 0, d= 1;
	cout<<"\nc && d: "<<(c && d)<<endl;
	cout<<"c || d: "<<(c || d)<<endl;
	
	//Bitwise operator
	cout << "\na & b = " << (a & b) << endl; 
	cout << "a | b = " << (a | b) << endl; 
	
	return 0;
}
