#include<stdio.h>
int main()
{
	int a[5],i,b[3][3],j,sum=0;
	for(i=0;i<=4;i++)
	{
		printf("Enter the element %d = ",i+1);

		scanf("%d",&a[i]);
	}
	for(i=0;i<=4;i++)
	{
		printf(" %d ",a[i]);
	}
	
	for(i=1;i<=3;i++)
	{
		for(j=1;j<=3;j++)
		{
			printf("\nEnter the elments in array[%d][%d] ", i,j);
			scanf("%d",&b[i][j]);
		
		}
		
	}
	for(i=1;i<=3;i++)
	{
		for(j=1;j<=3;j++)
		{
			
			sum = sum + b[i][j];
		}
		
	}
		printf("The sum of all elements is = %d", sum);

	
	
	
	
	
	
	
	return 0;
}
