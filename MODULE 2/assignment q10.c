#include<stdio.h>
int main()
{
		int a=10;
		int *ptr = &a;
		printf("\n The original value of a is %d",a);
		*ptr = 20;
		printf("\n The new value of a is %d",a);
	
	
	return 0;
}
