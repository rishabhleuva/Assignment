/*
write a C program that defines a structure to store a student's details (name,
roll number, and marks). Use an array of structures to store details of 3
students and print them
*/


#include<stdio.h>
struct student
{
	int roll;
	char name[50];
	int marks;
}
s[100];
int main()
{
	int count,i;
	printf("\n Enter the count of students ");
	scanf("%d",&count);
	for(i=1;i<=count;i++)
	{
		printf("\nEnter the details of the student %d",i);
		printf("\nName = ");
		scanf("%s",&s[i].name);
		printf("\nRoll No. = ");
		scanf("%d",&s[i].roll);
		printf("\nMarks = ");
		scanf("%d",&s[i].marks);
	
	}
	for(i=1;i<=count;i++)
	{
		printf("\n Details of student %d",i);
		printf("\n Name = %s",s[i].name);
		printf("\n Roll No. = %d",s[i].roll);
		printf("\n Marks = %d",s[i].marks);
		printf("\n");

	}
	
	
	return 0;
}
