#include<iostream>
using namespace std;
int main()
{
	int marks;
	cout<<"Enter the marks of the students ";
	cin>>marks;
	if(marks>=80)
	{
		cout<<"Grade A";
	}
	else if(marks>=60 && marks<80)
	{
		cout<<"Grade B";
	}
	else if(marks>=33 && marks<60)
	{
		cout<<"Grade C";
	}
	else
	{
		cout<<"Fail";
	}
	return 0;
}
