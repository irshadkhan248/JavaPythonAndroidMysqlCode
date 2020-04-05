def check(n):
	org_num=n
	sum=0
	while n>0:
		d=n%10
		sum=sum+d**3
		n=n//10
	if org_num==sum:
		return True
	else:
		return False
		
num=int(input("enter a number "))
if num < 0:
	print("b +ve")
else:
	ans=check(num)
	if ans:
		print("yes,it is")
	else:
		print("no,its not")
	