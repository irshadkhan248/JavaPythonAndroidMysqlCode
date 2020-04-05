#progrma to find sum of first five positive integers
sum,i=0,1
n=int(input("enter number "))
if n<=0 :
	print("enter +ve no ")
else:
	while i<=n:
		sum+=i
		i+=+1
	else:
		print("sum = ",sum)
