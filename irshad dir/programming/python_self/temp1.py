from mysql import connector
import getpass
u=input("Enter User:")
p=getpass.getpass()
u1=getpass.getuser()
mydb=None
try:
	mydb=connector.connect(host="localhost",user=u,passwd=p,)
	print("Hello Mr.",u1,"You Are Connected to Database")
	cursor=mydb.cursor()
	cursor.execute("create database if not exists mydatabase11")
	cursor.execute("use mydatabase11")
	cursor.execute("create table if not exists emp(emp_id int primary key,emp_name varchar(25))");
	print("table created")
	s1=int(input("Enter emp id:"))
	ename=input("Enter emp name:")
	sql="insert emp values('%d','%s')"
	args=(s1,ename)
	cursor.execute(sql%args)
	mydb.commit()
	print(cursor.rowcount," data inserted")
	mydb.commit()
	cursor.execute("select * from emp")
	myresult = cursor.fetchone()
	while myresult is not None:
		print(myresult)
		myresult=cursor.fetchone()
except connector.DatabaseError as e1:
	print("Access Denied, Please Enter Correct user And Password",e1)
	#mydb.rollback()
finally:
	if mydb is not None:
		mydb.close()
		print("disconnected")