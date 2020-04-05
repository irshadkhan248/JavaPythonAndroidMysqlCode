#user name and password
from getpass import *
u=input("Enter Username:")
u1=u.lower()
p=getpass()
user=getuser()
if u1=='kamal' and p=='abc123':
	print("welcome Mr.",user)
else:
	print("Access Denied! username or password wrong.")