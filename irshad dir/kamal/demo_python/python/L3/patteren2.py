# wapp to generae:
# A
# B	B
# C	C	C
# D	D	D	D
num=int(input("enter number of line "))
c=65
for i in range(num):
	for j in range(i+1):
		print(chr(c),end="\t")
	print()
	c+=1

num1=int(input("enter number of line "))
for k in range(num):
	for l in range(k+1):
		print("+",end ="\t")
	print()
	
