from mysql import connector
from matplotlib import pyplot as plt
import numpy as np
mydb=None
try:
	mydb=connector.connect(host='localhost',user='root',passwd='abc123',database='py_conn2')
	print('connected')
	cursor=mydb.cursor()
	cursor.execute('select sid,marks from student');
	data=cursor.fetchall()
	data.sort()
	sid=[]
	marks=[]
	for d in data:
		sid.append(d[0])
		marks.append(d[1])
	x=np.arange(len(sid))
	plt.bar(x,marks,width=0.25)
	plt.title("Student Performance")
	plt.xticks(x,sid)
	plt.xlabel("Roll Number")
	plt.ylabel("Marks")
	plt.grid()
	plt.show()
except connector.DatabaseError as e:
	print('unable to connect ',e)