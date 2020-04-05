#wap to find the sum of digit
n=int(input("Enter number "))
if n<0:
	print("b +ve")
else:
	sum=0
	while n>0:
		d = n%10
		sum=sum+d
		n //= 10
	else:
		print(sum)