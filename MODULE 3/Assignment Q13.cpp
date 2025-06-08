#include<iostream>
using namespace std;
int fact(int num)
{
	if(num!=0)
	{
		return num * fact(num-1);
	}
	else
	{
		return 1;
	}
	
}
int main()
{
	int a;
	cout<<"Enter the term for factorial ";
	cin>>a;
	
	int ans = fact(a);
	cout<<"The value of factorial is "<<ans;
	
	return 0;
}
