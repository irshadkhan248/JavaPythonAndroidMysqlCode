from tkinter import *  # Use this if use python 3.xx
#from Tkinter import *   # Use this if use python 2.xx
a = Button(text="Center Button")
b = Button(text="Top Left Button")
c = Button(text="Bottom Right Button")

a.place(relx=0.5, rely=0.5, anchor=CENTER)
b.place(relx=0.0, rely=0.0, anchor=NW)
c.place(relx=1.0, rely=1.0, anchor=SE)
mainloop()
















def f3():
	root.withdraw()
	vist.deiconify()
	con=None
	cursor=None
	try:
		con=connector.connect(user='root',host='localhost',password='abc123',database='py_conn2')
		cursor=con.cursor()

		sql='select *from employee;'
		cursor.execute(sql)
		data=cursor.fetchall()
		msg=''
		for d in data:
			msg=msg+'eid: '+str(d[0])+' ename: '+str(d[1])+'\n'
		stData.insert(INSERT,msg)
		stData.config(state=DISABLED)
	except connector.DatabaseError as e:
		messagebox.showerror('select issue>>> ',e)
	finally:
		if cursor is not None:
			cursor.close()
		if con is not None:
			con.close()