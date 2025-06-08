//Q3 part 2
#include<iostream>
using namespace std;
class area
{
	float length, width;
		public:
			area(float l, float w)
			{	
				length = l;
				width = w;
				 
			}
			float calculation()
			{
				cout<<"Area of rectangle is "<<length * width;
			}
};
int main()	
{
	float l,w;
	cout<<"Enter length ";
	cin>>l;
	cout<<"Enter width ";
	cin>>w;
	area A1(l,w);	
	A1.calculation()	;
	return 0;
}
