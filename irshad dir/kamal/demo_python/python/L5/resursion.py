#recursion
#"resursion.py"
def fact(x):
	if x==1:
		return 1
	else:
		return(x*fact(x-1))

num=int(input(" enter number "))
if num<0:
	print("Be positive ")
elif num==0 or num==1:
	print("answer= ",1)
else:
	ans=fact(num)
print("ans ",ans)