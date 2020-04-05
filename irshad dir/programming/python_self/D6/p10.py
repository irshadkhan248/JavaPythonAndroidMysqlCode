import os
dn=input("Enter Name of Directory:")
if(not os.path.exists(dn)):
	os.mkdir(dn)
	print("directory created")
else:
	print("directory already exists")