#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int main()
{
	srand(time(0));
	int a = 0;
	int m = rand() % 100;
	int n;
	cout<<"Enter any number between 1 to 100 : ";
	do
	{
		
		cin>>n;

		if(m>n)
		{
			cout<<"Too low"<<endl;
			cout<<"Try Again ";

		
		}
		else if(m<n)
		{
			cout<<"Too high"<<endl;
			cout<<"Try Again ";

		}
		else
		{
			cout<<"You have guessed correct number"<<endl;
		}
		a++;
	}
	while(m!=n);
	cout<<"Number of attempts = "<<a;
	return 0;	
}
