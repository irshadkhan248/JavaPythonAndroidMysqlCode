#user name and password
import getpass
u=input("Enter Username:")
u1=u.lower()
p = getpass.getpass()
p1=p.lower()
user=getpass.getuser()
if u1=='kamal'and p1=='abc123':
	print("welcome Mr.",user)
else:
	print("username or password wrong Mr.",user)

#print("welcome ",user)