from mysql import connector
import getpass
u=input("Username:")
p = getpass.getpass()
try:
	mydb=connector.connect(host='localhost',user=u,passwd=p)
	print("connected")
except connector.DatabaseError as e:
	print("Access denied")
