from mysql import connector
import getpass
u=input("Username:")
p = getpass.getpass()
mydb=None
cursor=mydb.cursor()
try:
    mydb=connector.connect(host='localhost',user=u,passwd=p)
    print ("Connected")
	sql="create database emp99915123;"
	cursor.execute(sql)
	sql="select database();"
	d=cursor.execute(sql)
	print('database created',d)
except connector.DatabaseError as e:
	print("username or password is incorrect ,",e)
finally:
	if mydb is not None:
		mydb.close()
		print("disconnected")