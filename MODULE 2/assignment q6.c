#include<stdio.h>
int main()
{
	int i,j,k=1;
	printf("\nfor loop");
	for(i=1;i<=10;i++)
	{
		printf(" %d ",i);
		
		
	}
	printf("\n While loop");
	while(j<=10)
	{
		printf(" %d ",j);
		j++;
	}
	
	printf("\n Do While loop");
	do{
		printf(" %d ",k);
		k++;
	}
	while(k<=10);
	
	
	
	
	
	return 0;
}
