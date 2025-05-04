#include<stdio.h>
int main()
{
	int a,b;
	printf("\nEnter the value of a ");
	scanf("%d",&a);
	
	printf("\nEnter the value of b ");
	scanf("%d",&b);
	
	//arithmetic operators
	printf("\n The addition of a and b is %d", a+b);
	printf("\n The substraction of a and b is %d", a-b);
	printf("\n The multiplication of a and b is %d", a*b);
	
	//relational operators
	
    printf("\na == b: %d", a == b);
    printf("\na != b: %d", a != b);
    printf("\na > b: %d", a > b);
    printf("\na < b: %d", a < b);
    printf("\na >= b: %d", a >= b);
    printf("\na <= b: %d", a <= b);
	
	//logical operators
	
	
    if (a < b && b < 20)
        printf("\nBoth conditions are true");

    if (a == b || b == 10)
        printf("\nAt least one condition is true");
	
	return 0;
}
