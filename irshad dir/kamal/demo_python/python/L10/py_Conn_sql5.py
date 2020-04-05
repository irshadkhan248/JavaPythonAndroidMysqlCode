from mysql import connector
mydb=None
try:
	mydb=connector.connect(host='localhost',user='root',passwd='abc456',database='py_conn2')
except connector.DatabaseError as e:
	print('username or password incorrect >>>',e)
try:	
	cursor=mydb.cursor()
	sql='select * from employee;'
	cursor.execute(sql)
	row=cursor.fetchone()           #fetchone 
	while row is not None:
		print(row)
		row=cursor.fetchone()
except connector.DatabaseError as e:
	print(e)
try:
		
	cursor=mydb.cursor()
	sql='select * from employee;'
	cursor.execute(sql)
	row=cursor.fetchall()	#fetchall
	print('Total number of rows=',cursor.rowcount)
	print()
	for r in row:
		print(r)
except connector.DatabaseError as e:
	print(e)

finally:
	cursor.close()
	if mydb is not None:
		mydb.close()
		print('disconnected')	
	