#include<iostream>
using namespace std;
int main()
{
	int row,col,i,j,a[10][10],b[10][10],ans[10][10];
	cout<<"Enter the value of row: "<<endl;
	cin>>row;
	cout<<"Enter the value of col: "<<endl;
	cin>>col;
	
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			cout<<"Enter the elements in array a: "<<endl;
			cin>>a[i][j];
		}
	}
		
	
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			cout<<"Enter the elements in array b: "<<endl;
			cin>>b[i][j];
		}
	}	
	
	
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			ans[i][j] = a[i][j] + b[i][j];
		}
	}
	
	cout<<"Addition of both array is "<<endl;
	
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			cout<<ans[i][j]<<" ";
		}
		cout<<"\n";
	}
	
	return 0;
}
