import os
org_dir=input("Enter directory Name:")
if(os.path.isdir(org_dir)):
	new_dir=input("Enter new name of directory:")
	try:
		os.rename(org_dir,new_dir)
		print('directory renamed')
	except FileExistsError:
		print("new directory already exists")
else:
	print('directory not found')
	