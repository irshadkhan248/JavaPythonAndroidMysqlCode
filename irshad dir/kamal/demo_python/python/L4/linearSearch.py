#wapp to read number from user and prefrom linear search

import array
marks=array.array('i',[])
n=int(input("enter number of element "))
for i in range(n):
	ele=int(input("enter element"))
	marks.append(ele)
count=0
k=int(input("enter the element to search "))
for i in range(len(marks)):
	if marks[i]==k:
		print("ele found at",i+1)
		count=count+1

if count==0:
	print(" element not found")