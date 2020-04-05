''' wapp to print
*
*	*
*	*	*
*	*	*	*

'''

num=int(input("enter number of lines "))
for i in range(num):
	for j in range(i+1):
		print("*" ,end="\t")
	print()
 