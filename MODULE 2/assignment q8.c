#include<stdio.h>
int fact(num);



int fact(int num)
{
	int factorial=1,i;
	
	for(i=1;i<=num;i++)
	{
		factorial = factorial * i;
	}
	return factorial;
}
int num;
int main()
{
	printf("Enter the number ");
	scanf("%d",&num);
	
	int result = fact(num);
	printf("The factorial of %d is %d ",num,result);
	
	
	
	
	
	
	
	return 0;
}
