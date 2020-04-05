'''' Recursive Python3 program to 
find sum of digits of a number 

Function to check sum of 
digit using recursion '''

def sum_of_digit( n ): 
	if n == 0: 
		return 0
		return (n % 10 + sum_of_digit((n // 10))) 

num =int(input("enter number")
result =sum_of_digit(num) 
print("Sum of digits in",num,"is", result) 

