# def f1(a,b):
	# if b==0:	
		# raise ValueError('B is equal to 0')
	# c=a/b
	# print(c)
# f1(10,4)
# f1(5,0)
f = open("demofile.txt", "r")
f = open("demofile2.txt", "a")
f.write("Now the file has more content!")
f.close()
# print(f.readline())
# print(f.readline())
# print(f.readline())
# print(f.readline())
f = open("demofile2.txt", "r")
print(f.read()) 