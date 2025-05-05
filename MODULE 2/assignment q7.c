#include<stdio.h>
int main()
{
	int i,k;
	printf("Break statement stopping at 5\n");	
	for(i=1;i<=10;i++)
	{
		
		if(i==5)
		{
			break;
		}
		printf(" %d ",i);		
		
	}
	printf("\nContinue statement skipping 3\n");
	for(k=1;k<=5;k++)
	{
		if(k==3)
		{
			continue;
		}
		printf(" %d ",k);
	}
	
	
	
	
	return 0;
}
