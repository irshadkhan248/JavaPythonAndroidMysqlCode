import os
dn=input("Enter Name of Directory to delete")
if(not os.path.isdir(dn)):
	print("directory does not exists")
else:
	os.rmdir(dn)
	print("directory deleted")