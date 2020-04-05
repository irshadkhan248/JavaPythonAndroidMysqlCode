#wapp to accept the element from user and print it
#program written and complied by IRSHAD 
from array import *
try:
	num=array('i',[])
	n=int(input('Please Enter number of elements in array:'))
	if n<=0:
		print(n,'cannot be the size of array,please Enter positive integer.')
		exit()
	for i in range(n):
		ele=int(input('Enter element:'))
		num.append(ele)
	print(num)
	for d in num:
		print(d,end=' ')
	print()
	for i in range(len(num)):
		print(num[i],end=' ')
		print('\n')
except ValueError:
	print('please Enter integer Only!')
finally:
	print('\n')
	print('Have a Good day')