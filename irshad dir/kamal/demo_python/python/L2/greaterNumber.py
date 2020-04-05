#wapp to read 3 numbers form cmdLine and find max of three

# a=int(input("Enter first number"))
# b=int(input("Enter first number"))
# c=int(input("Enter first number"))



import sys

a=int(sys.argv[1])
b=int(sys.argv[2])
c=int(sys.argv[3])

if a>b & a>c:
	print(a," is greater")
elif b>a & b>c:
	print(b," is greater")
else:
	print(c," c is greater")