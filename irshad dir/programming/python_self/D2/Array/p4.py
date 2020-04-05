#maximum and minimum eleemt in array 
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
	print('maximum marks:',max(marks))
	print('minimum marks:',min(marks))
except ValueError:
	print('please Enter integer Only!')
finally:
	print('\n')
	print('Thanking you for using This program.')