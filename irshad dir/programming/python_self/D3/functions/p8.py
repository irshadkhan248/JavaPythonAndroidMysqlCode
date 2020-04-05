a=10 
b=20
def f1():
	global a
	a=50
	b=80
	print(a,b)

print(a,b)
f1()
print(a,b)