#include<stdio.h>
int main()
{
	int choice,quant,total = 0,price;
	char ch;
	up:
	printf("------------Menu------------");
	printf("\n1. Pizza \t price = 180rs/pc");
	printf("\n2. Burger \t price = 80rs/pc");
	printf("\n3. Sandwich \t price = 80rs/pc");
	printf("\n4. Vadapav \t price = 40rs/pc");
	printf("\nEnter your choice ");
	scanf("%d", &choice);
	
	
	switch(choice)
	{
		case 1:
			printf("\n You have selected Pizza");
			printf("\n Enter the quantity of the selected item ");
			scanf("%d", &quant);
			price = quant*180;
			printf("\n Price of the selected item is %d ", price);
			total = total + price;
			printf("\n Total bill : %d",total);
		break;	
		
		
		case 2:
			printf("\n You have selected Burger");
			printf("\n Enter the quantity of the selected item ");
			scanf("%d", &quant);
			price = quant*80;
			printf("\n Price of the selected item is %d ", price);
			total = total + price;
			printf("\n Total bill : %d",total);
		break;
		
		
		case 3:
			printf("\n You have selected Sandwich");
			printf("\n Enter the quantity of the selected item ");
			scanf("%d", &quant);
			price = quant*80;
			printf("\n Price of the selected item is %d ", price);
			total = total + price;
			printf("\n Total bill : %d",total);
		break;
		
		
		case 4:
			printf("\n You have selected Vadapav");
			printf("\n Enter the quantity of the selected item ");
			scanf("%d", &quant);
			price = quant*40;
			printf("\n Price of the selected item is %d ", price);
			total = total + price;
			printf("\n Total bill : %d",total);
		break;
		
		default:
			printf("\nInvalid Input");
		break;
	}
		

		printf("\nPress Y to place another order? ");
		scanf(" %c", &ch);
		if(ch=='Y' || ch=='y')
		{
			goto up;	
		}
		else
		{
			printf("Thank you for ordering");
		}

	

	return 0;
}
