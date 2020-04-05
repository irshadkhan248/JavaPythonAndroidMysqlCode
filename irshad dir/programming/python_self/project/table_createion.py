#------------------------------------------program written by Irshad-------------------------------------------------------

from mysql import connector
#-------------------------------------------------------table creation-------------------------------------------------------
try:
	mydb=connector.connect(host='localhost',user='root',passwd='abc123',database='py_conn2')
	print('connected')
except connector.DatabaseError as e:
	print('unable to connect ',e)
cursor=mydb.cursor()
cursor.execute('create table if not exists student(sid int primary key,sname varchar(30))');
print('table created')

# #-------------------------------------------------------------add---------------------------------------------------------------
try:
	stu_id =int(input('enter student ID:'))
except (ValueError,Exception):
	print("! please enter correct ID.")
	exit()
try:
    int(stu_id)
except ValueError:
	print ("! please enter correct ID.")
	exit()

stu_name=input('Enter student name:')

if stu_name.isalpha():
	pass
else:
	print ("! please enter correct Name.")
	exit()

sql="insert into student values('%d','%s')";
args=(stu_id,stu_name)
cursor.execute(sql%args)
mydb.commit()
print('row inserted')
#---------------------------------------------------------------Update---------------------------------------------------------

try:
	stu_id =int(input('enter student ID:'))
except (ValueError,Exception):
	print("! please enter correct ID.")
	exit()
try:
    int(stu_id)
except ValueError:
	print ("! please enter correct ID.")
	exit()

stu_name=input('Enter student name:')

if stu_name.isalpha():
	pass
else:
	print ("! please enter correct Name.")
	exit()
sql="update student set sname='%s' where sid='%d'";
args=(stu_name,stu_id,)
cursor.execute(sql%args)
mydb.commit()
print('row updated')

#------------------------------------------------------------delete------------------------------------------------------------------
try:
	stu_id =int(input('enter student ID:'))
except (ValueError,Exception):
	print("! please enter correct ID.")
	exit()
try:
    int(stu_id)
except ValueError:
	print ("! please enter correct ID.")
	exit()
sql="delete from student where sid='%d'";
args=(stu_id,)
cursor.execute(sql%args)
mydb.commit()
print(cursor.rowcount,' row deleted')
