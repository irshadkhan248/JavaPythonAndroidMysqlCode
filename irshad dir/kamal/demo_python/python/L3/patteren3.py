# wapp to generate 
# *	*	*	*
# *	*	*
# *	*
# *
num=int(input("enter number of lines "));
for i in range(num):
	for j in range(num):
		print("*",end="\t");
	print();
	num-=1;
	