#wap to read mars from the user ans and print the sum and avg
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
	sum=0
	for i in marks:
		sum+=i
	print('Sum of marks:',sum)
	avg=sum/stu
	print('Average marks:%-10.2f'%avg)
except ValueError:
	print('please Enter integer Only!')
finally:
	print('\n')
	print('Thanking you for using The program.')
