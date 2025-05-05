/*
LAB EXERCISE:
Write a C program that takes two strings from the user and concatenates them
using strcat(). Display the concatenated string and its length using
strlen()
*/
#include<stdio.h>
int main()
{
	char string1[100],string2[100];
	printf("Enter the string1 = ");
	gets(string1);
	
	printf("\nEnter the string2 = ");
	gets(string2);
	strcat(string1,string2);
	printf("\n concatenated string = %s",string1);
	
	int result = strlen(string1);
	printf("\nThe length of concatenated string is = %d",result);
	
	
	
	
	
	
	return 0;
}
