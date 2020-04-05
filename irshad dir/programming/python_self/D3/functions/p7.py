# Python code to demonstrate math.factorial() 
import math 
try:
	num=int(input('Enter number:'))
	if num==0 or num==1:
		print(1)
		exit()
	print (math.factorial(num)) 
except ValueError:
	print('Please Enter positive Integer only')