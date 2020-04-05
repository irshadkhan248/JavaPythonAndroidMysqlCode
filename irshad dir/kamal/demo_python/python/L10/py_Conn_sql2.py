from mysql import connector
mydb=None
try:
	mydb=connector.connect(user='root',host='localhost',password='abc456')
	print('connected')
	#print(mydb.version)
except connector.ProgrammingError as e:
	print("user name or password is incorrect")
finally:

	if mydb is not None:
		mydb.close()
		print('disconnected')
	