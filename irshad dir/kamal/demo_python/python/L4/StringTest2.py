#wapp to count the no of volve and consonent
s1=input("enter a string ")
vc,cc=0,0
for c in s1:
	if c.isalpha():
		if c in ['a','e','i','o','u']:
			vc=vc+1
		else:
			cc=cc+1
print("vc",vc,"cc",cc)



	# if s1=='a' or s1=='e' or s1=='i' or s1=='o'or s1=='u':
		# print("it is")
	# print("its not")
