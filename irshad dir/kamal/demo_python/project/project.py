from tkinter import *
from tkinter import messagebox
from tkinter import scrolledtext
from mysql import connector
root=Tk()
root.title('S. M .S')
root.geometry('500x500+350+150')
vist=Toplevel(root)
vist.title('view Student')
vist.geometry('500x500+350+150')
vist.withdraw()
stData=scrolledtext.ScrolledText(vist,width=40,height=10)
stData.pack()
exitButton1 =Button(root, text='Exit', width=20, command=root.destroy)
exitButton1.place(x=170,y=200)
def f4():
	vist.withdraw()
	root.deiconify()
btnBack=Button(vist,text='Back',command=f4)
btnBack.pack()

def f1():
	root.withdraw()
	adst.deiconify()
btnAdd=Button(root,text='Add',width=20,command=f1)
btnAdd.pack()
btnAdd.pack(pady=20)
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
btnView=Button(root,text='View',width=20,command=f3)
btnView.pack()
btnView.pack(pady=20)

adst=Toplevel(root)
adst.title('Add Student')
adst.geometry('500x500+350+150')
adst.withdraw()

lblAddRno=Label(adst,text='enter rno')
entAddRno=Entry(adst,bd=5)
lblAddName=Label(adst,text='enter name')
entAddName=Entry(adst,bd=6)

def f5():
	#con=None
	cursor=None
	try:
		con=connector.connect(user='root',host='localhost',password='abc123',database='py_conn2')
		eid=int(entAddRno.get())
		ename=(entAddName.get())
		sql="insert into employee values('%d','%s');"
		args=(eid,ename)
		cursor=con.cursor()
		cursor.execute(sql%args)
		con.commit()
		msg=str(cursor.rowcount)+ ' record inserted'
		messagebox.showinfo("success",msg)
	except connector.DatabaseError as e:
		con.rollback()
		messagebox.showerror('Failure >>> ',e)
	finally:
		if cursor is not None:
			cursor.close()
		if con is not None:
			con.close()
btnAddSave=Button(adst,text='Save',command=f5)
def f2():
	adst.withdraw()
	root.deiconify()
btnAddBack=Button(adst,text='Back',command=f2)
lblAddRno.pack(pady=10)
entAddRno.pack(pady=10)
lblAddName.pack(pady=10)
entAddName.pack(pady=10)
btnAddSave.pack(pady=10)
btnAddBack.pack(pady=10)
root.mainloop()