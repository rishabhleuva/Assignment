/*Write a C program to create a file, write a string into it, close the file, then
open the file again to read and display its contents. */
/*Write a C program to create a file, write a string into it, close the file, then
open the file again to read and display its contents. */
#include<stdio.h>
int main()
{
FILE*fp1;
    fp1=fopen("first.txt","w");
    fprintf(fp1,"My first file");
    if (fp1 == NULL)
    {
        printf("\nError in opening the file");
        return 1;
    }
    fclose(fp1);
    fp1=fopen("first.txt","r");
    char str[100];
    fgets(str,100,fp1);
return 0;
}


