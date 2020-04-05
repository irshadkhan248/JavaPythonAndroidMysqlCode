#max n min of numbers in array

import array
n=int(input("enter number of element :"))
num=array.array('i',[])
for i in range(n):
	ele=int(input("enter element :"))
	num.append(ele)

min=max=num[0]
for d in num:
	if d>max:
		max=d
	if d<min:
		min=d
print("largest number :",max,"\n""smallest number :",min)