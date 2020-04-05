# wapp to generate 
# A
# B	B
# C	C	C
# D	D	D	D

c=65
num=int(input("enter number of line "))
for i in range(num):
	for j in range(i+1):
		print(chr(c),end="\t")
	print()
	c+=1
	