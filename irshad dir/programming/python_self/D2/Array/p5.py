# sort array  
#program written and complied by IRSHAD 
from array import *
try:
	marks=array('i',[])
	stu=int(input('Enter number of student:'))
	if stu<=0:
		print('student should be atleast 1')
		exit()
	for i in range (stu):
		m=int(input('Enter Marks:'))
		marks.append(m)
	print(marks)
	for i in range (stu-1):
		for j in range(i+1,stu):  #remove stu to sort in decending order 
			if marks[i]>marks[j]:
				marks[i],marks[j]=marks[j],marks[i]
	print(marks);
except ValueError:
	print('please Enter integer Only!')
finally:
	print('\n')
	print('Thanking you for using The program.')