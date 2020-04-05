#wap to find the sum of digit
n=int(input("Enter number "))
if n<0:
	print("b +ve")
else:
	rev=0
	while n>0:
		d = n%10
		rev=rev*10+d
		n //= 10
	else:
		print(rev)