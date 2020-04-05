#wapp to read marks from the user and print the max and min marks

import array
marks=array.array('i',[])
n=int(input("enter number of students "))
for i in range(n):
	ele=int(input("enter marks"))
	marks.append(ele)
	

max=min=marks[0]

for d in marks:
	
	if d>max:
		max=d
		
	if d<min:
		min=d
print("max",max)
print("min",min)