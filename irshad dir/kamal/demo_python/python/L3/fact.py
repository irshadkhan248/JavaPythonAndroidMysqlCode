#wap to find fact

num=int(input("enter a number"))
if num<0:
	print("b v+")
elif num==0 and num ==1:
	print("fact ",1)
else:
	fact=1
	for i in range(1,num+1):
		fact=fact*i
	else:
		print("fact = ",fact)
