/*
LAB EXERCISE:
Write a C program that includes variables, constants, and comments. Declare
and use different data types (int, char, float) and display their values.
*/

#include <stdio.h>

int main() 
{
    int a = 5;
    char c = 'P';
    float b = 43.43;

    // Constant variable
    const float PI = 3.14;

    printf("int value = %d\n", a);
    printf("char value = %c\n", c);
    printf("float value = %.2f\n", b);
    printf("constant PI = %.2f\n", PI);

    return 0;
}

