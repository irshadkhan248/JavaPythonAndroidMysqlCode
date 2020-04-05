from mysql import connector
mydb=None

try:
	mydb=connector.connect(host='localhost',user='root',password='abc456',database='py_conn3')
	print('connected')
	cursor=mydb.cursor()

except connector.DatabaseError as e:
	print('username or password incorect >>>',e)
	exit()


try:
	sql='create database if not exists py_conn2 ;'
	cursor.execute(sql)
	print('database created')

except connector.DatabaseError as e:
	print('database could not be created >>>',e)



try:
	sql='use py_conn2;'
	cursor.execute(sql)

except connector.DatabaseError as e:
	print('select correct database >>>',e)
	exit()



try:
	sql='create table if not exists employee(eid int primary key,ename varchar(25));'
	cursor.execute(sql)
	print('table created')

except connector.DatabaseError as e:
	print('table could not be inserted >>>',e)
	exit()


try:
	sql="insert into employee values(4,'simmy');"
	cursor.execute(sql)
	mydb.commit()
	print('data insertd succesfully')

except connector.DatabaseError as e:
	mydb.rollback()
	print('data  could not be created >>>',e)



try:
	sql='select * from employee;'
	cursor.execute(sql)

except connector.DatabaseError as e:
		print(e)
finally :
	if mydb is not None:
		mydb.close()
		print('disconnected')

