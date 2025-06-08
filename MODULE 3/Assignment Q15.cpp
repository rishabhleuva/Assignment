#include<iostream>
using namespace std;
int main()
{
	int a[100],i,size,sum=0;
	cout<<"Enter the size of array : ";
	cin>>size;
	for(i=1;i<=size;i++)
	{
		cout<<"Enter the elements of array ";
		cin>>a[i];
		sum = sum + a[i];
	}
	
	cout<<"The addition of all the elements of array is: "<< sum;
	cout<<"\nThe average is: "<<sum/size;
	
	return 0;
}
