# #wapp to preform the following operation on
# s1=name of student who have joined andorid
# s2=name of student who have joined python
# a1) total student
# a2) common student
# a3) student in android  but not in python
# a4) student in python but not in android


set1=set()
set2=set()
a=int(input("enter number of student in android: "))
for i in range(a):
	stu1=input("enter name of student in pytthon batch: ")
	set1.add(stu1)
		
b=int(input("enter number of student in android: "))
for i in range(b):
	stu2=input("enter name of student in android batch: ")
	set2.add(stu2)
r1=set1|set2
print(r1)

r2=set1 & set2
print(r2)

r3=set1-set2
print(r3)

r4=set2-set1
print(r4)