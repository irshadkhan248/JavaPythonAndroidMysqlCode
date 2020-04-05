#sum and avg of marks of students
import array
s=int(input("enter no of student:"))
marks=array.array('i',[])
for i in range(s):
	m1=int(input("enter marks:"))
	marks.append(m1)
	
sum=0;
for m in marks:
	sum+=m
print("sum of marks:",sum)
print("average of marks:",sum/s)

