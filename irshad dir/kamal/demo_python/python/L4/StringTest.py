#wapp to count the number of letters,digits and other characters
s1=input("enter a string")
lc,dc,oc=0,0,0
for c in s1:
	if c.isalpha():
		lc=lc+1
	elif c.isdigit():
		dc=dc+1
	else:
		oc=oc+1
print("lc",lc,"dc",dc,"oc",oc)