#wapp to define a function to find sum of digits

def digisum(n):
	sum1=0
	while n> 0:

		d=n%10
		sum1=sum1+d
		n=n//10
	print(sum1)
	

num=int(input("enter number"))
digisum(num)