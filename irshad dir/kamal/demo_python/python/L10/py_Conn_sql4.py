from mysql import connector
mydb=None
try:
	mydb=connector.connect(host='localhost',user='root',password='abc456',database='py_conn2')

	print('Connected')
except connector.DatabaseError as e:
	print(e)
try:
	eid=int(input('enter employee id: '))
except ValueError as e:
	print('Incorrect employee ID >>>>',e)
	exit()
try:
	ename=input('enter name of employee: ')
except ValueError as e:
	print('Incorrect employee ID >>>>',e)
try:
	cursor=mydb.cursor()
	sql="insert into employee values('%d','%s')"
	args=(eid,ename)
	cursor.execute(sql%args)
	mydb.commit()
	print(cursor.rowcount,'rows inserted')
except connector.DatabaseError as e:
	print(e)

finally:
	if mydb is not None:
		mydb.close()
		print('disconnected')