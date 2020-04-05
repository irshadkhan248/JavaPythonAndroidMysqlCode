def sod(n):
	if n==0:
		return 0
	else:
		return n%10+sod(n//10)
num=int(input("enter number "))
if num <0 :
	print("b +ve ")
else:
	ans=sod(num)
	print(ans)