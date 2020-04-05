
#-----------program written by Irshad Ahmed---------------

from tkinter import *
from tkinter import messagebox
from tkinter import scrolledtext
from mysql import connector
from PIL import Image, ImageTk
import socket
import requests
import bs4
import datetime
import time
import getpass
app= Tk()
app.title("Welcome!")
image2 =Image.open('image999.jpg')
image1 = ImageTk.PhotoImage(image2)
w = image1.width()
h = image1.height()
app.geometry("1200x630+50+0")

label1 = Label(app, image=image1,font=("Times New Roman", 24),justify=CENTER, height=400)
label1.pack()
res=requests.get("https://ipinfo.io/")
data=res.json()
city=data['city']
#print(city)
cityLabel=Label(app,text=city,font=("Times New Roman", 24))
cityLabel.place(x=155,y=438)
cL=Label(app,text='You are in',font=("Times New Roman", 24))
cL.place(x=10,y=438)

website="http://api.openweathermap.org/data/2.5/weather?units=metric"
loc="&q="+city
api_key="&appid=c6e315d09197cec231495138183954bd"
res1=requests.get(website+loc+api_key)
wdata=res1.json()
m=wdata['main']
t=m['temp']
temp=str(t)+"\u00b0"+" C"
#print('Temperature',t)
tempLabel=Label(app,text=temp,font=("Times New Roman", 24))
tempLabel.place(x=185,y=470)
Tl=Label(app,text='Temperature:',font=("Times New Roman", 24))
Tl.place(x=10,y=470)
t2=datetime.datetime.now().strftime("%Y-%m-%d	Time:%H:%M:%S")
Tlabel=Label(app,text='Date:'+t2,font=("Times New Roman", 24))
Tlabel.place(x=10,y=505)
d=datetime.datetime.now()
h=d.hour
msg=""
if h>=0 and h<12:
	msg="Good Morning !!!"
elif h>=12 and h<17 :
	msg='Good Afternoon !!!'
elif h>=17 and h<21:
	msg='Good Evening !!! '
else:
	msg='Good Night !!!'
n=getpass.getuser()
n1=n.capitalize()
msg1=msg+' '+n1
mL=Label(app,text=msg1,font=("Times New Roman", 24))
mL.place(x=10,y=405)
res=requests.get("https://www.brainyquote.com/quote_of_the_day.html")
print(res)
soup=bs4.BeautifulSoup(res.text,'lxml')
data=soup.find('img',{"class":"p-qotd"})
#print(data)
q=data['alt']
#print(q)
i_url=data['data-img-url']
#print(i_url)
soup=bs4.BeautifulSoup(res.text,'lxml')
data=soup.find('img',{"class":"p-qotd"})
#print(data)
q=data['alt']
#print(q)
i_url=data['data-img-url']
#print(i_url)

p_url='https://www.brainyquote.com'+i_url
res=requests.get(p_url)
with open("image999.jpg","wb") as f:
	f.write(res.content)
app.after(9000, app.destroy)
app.mainloop()

#-----------------------------windows-----------------------

try:
	mydb=connector.connect(host='localhost',user='root',passwd='abc123',database='py_conn2')
#	print('connected')
except connector.DatabaseError as e:
	print('unable to connect ',e)
cursor=mydb.cursor()
cursor.execute('create table if not exists student(sid int unsigned primary key,sname varchar(30),marks tinyint unsigned)');
#print('table created')


root = Tk()
root.title('Student Managment System')
root.geometry("500x450+300+290")


def f1():
	root.withdraw()
	adst.deiconify()
btnAdd=Button(root,text='Add',width=20,command=f1)
btnAdd.pack()
btnAdd.pack(pady=20)


def f9():						#vist back Button
	vist.withdraw()
	root.deiconify()

vist=Toplevel(root)
vist.title('view Student')
vist.geometry('500x500+350+150')
vist.withdraw()

stData=scrolledtext.ScrolledText(vist,width=40,height=10)
stData.pack()

btnBack=Button(vist,text='Back',command=f9)   #
btnBack.pack(pady=10)

#------------------------view------------------------

def f3():
	root.withdraw()
	vist.deiconify()
	con=None
	cursor=None
	try:
		con=connector.connect(user='root',host='localhost',password='abc123',database='py_conn2')
		cursor=con.cursor()

		sql='select *from student;'
		cursor.execute(sql)
		data=cursor.fetchall()
		msg=''
		for d in data:
			msg=msg+'RollNo: '+str(d[0])+' Name: '+str(d[1])+'			Marks:'+str(d[2])+'\n'
		stData.insert(INSERT,msg)
		stData.config(state=DISABLED)
	except connector.DatabaseError as e:
		messagebox.showerror('select issue>>> ',e)
	finally:
		if cursor is not None:
			cursor.close()
		if con is not None:
			con.close()

btnView=Button(root,text='View',width=20,command=f3)#,command=f1
btnView.pack()
btnView.pack(pady=10)

adst=Toplevel(root)
adst.title('Add Student')
adst.geometry('500x500+350+150')
adst.withdraw()

lblAddRno=Label(adst,text='Enter Roll No')
entAddRno=Entry(adst,bd=5)
lblAddName=Label(adst,text='Enter Student Name')
entAddName=Entry(adst,bd=6)
lblAddMarks=Label(adst,text='Enter Marks')
entAddMarks=Entry(adst,bd=6)
lblAddRno.pack(pady=10)
entAddRno.pack(pady=10)
lblAddName.pack(pady=10)
entAddName.pack(pady=10)
lblAddMarks.pack(pady=10)
entAddMarks.pack(pady=10)


def f2():                         #adst back button command
	adst.withdraw()
	root.deiconify()

#-------------------ADD-----------------

def f5():							#adst save button command
	try:
		con=connector.connect(user='root',host='localhost',password='abc123',database='py_conn2')
		eid=int(entAddRno.get())
		ename1=(entAddName.get())
		ename=ename1.capitalize()
		emarks=int(entAddMarks.get())
		try:														#eidTry
			if (eid == 0):	# or (len(ename)<2) or (emarks < 0 or emarks >100):
				msg=('Please Enter correct RollNo')
				messagebox.showerror("Error",msg)
				entAddRno.delete(0,END)
				entAddRno.focus()
				# entAddName.delete(0,END)
				# entAddMarks.delete(0,END)
				#print('enter correct Id')
			elif len(ename)<2 or ename.isnumeric():
				msg=('Please Enter correct Name')
				messagebox.showerror("Error",msg)
				entAddName.delete(0,END)
				entAddName.focus()
				#print('enter correct Name')
			elif emarks < 0 or emarks >100:
				msg=('Please Enter Correct Marks')
				messagebox.showerror("Error",msg)
				entAddMarks.delete(0,END)
				entAddMarks.focus()
				#print('enter correct Marks')
			else:
				sql="insert into student values('%d','%s','%d');"
				args=(eid,ename,emarks)
				cursor=con.cursor()
				cursor.execute(sql%args)
				con.commit()
				msg=str(cursor.rowcount)+ ' record inserted'
				messagebox.showinfo("success",msg)
				entAddRno.delete(0,END)
				entAddRno.focus()
				entAddName.delete(0,END)
				entAddMarks.delete(0,END)

		except connector.DatabaseError as e:
			con.rollback()
			messagebox.showerror('Failure >>> ',e)
	except connector.DatabaseError as e:
			con.rollback()
			messagebox.showerror('Failure >>> ',e)

addSaveButton=Button(adst,text='Save',command=f5)
addSaveButton.pack(pady=10)
addBackButton=Button(adst,text='Back',command=f2)
addBackButton.pack(pady=10)

#---------------------update------------------------

updst=Toplevel(root)
updst.title('Update Student')
updst.geometry('500x500+350+150')
updst.withdraw()

lblUpdateRno=Label(updst,text='Enter Roll No')
entUpdateRno=Entry(updst,bd=5)
lblUpdateName=Label(updst,text='Enter Student Name')
entUpdateName=Entry(updst,bd=6)

lblUpdateMarks=Label(updst,text='Enter Marks')
entUpdateMarks=Entry(updst,bd=6)

lblUpdateRno.pack(pady=10)
entUpdateRno.pack(pady=10)
lblUpdateName.pack(pady=10)
entUpdateName.pack(pady=10)

lblUpdateMarks.pack(pady=10)
entUpdateMarks.pack(pady=10)


def f12():
	try:
		stu_id_Up=int(entUpdateRno.get())
		stu_name_Up=str(entUpdateName.get())
		stu_Marks_Up=int(entUpdateMarks.get())

		if (stu_id_Up == 0):	# or (len(ename)<2) or (emarks < 0 or emarks >100):
			msg=('Please Enter correct RollNo')
			messagebox.showerror("Error",msg)
			entUpdateRno.delete(0,END)
			entUpdateRno.focus()
			# entAddName.delete(0,END)
			# entAddMarks.delete(0,END)
			#print('enter correct Id')
		elif len(stu_name_Up)<2 or stu_name_Up.isnumeric:#  elif len(stu_name_Up)<2 or stu_name_Up.isnumeric():
			msg=('Please Enter correct Name')
			messagebox.showerror("Error",msg)
			entUpdateName.delete(0,END)
			entUpdateName.focus()
			#print('enter correct Name')
		elif stu_Marks_Up < 0 or stu_Marks_Up >100:
			msg=('Please Enter Correct Marks')
			messagebox.showerror("Error",msg)
			entUpdateMarks.delete(0,END)
			entUpdateMarks.focus()
			#print('enter correct Marks')
		else:
			sql="update student set sname='%s',marks='%d' where sid='%d'";
			args=(stu_name_Up,stu_Marks_Up,stu_id_Up)
			cursor.execute(sql%args)
			mydb.commit()
			msg=cursor.rowcount,"row affected."
			messagebox.showinfo("Updated",msg)
			entUpdateRno.delete(0,END)
			entUpdateRno.focus()
			entUpdateName.delete(0,END)
			entUpdateMarks.delete(0,END)
	except (connector.DatabaseError,Exception)as e:
		print(e)

btnUpdateSave=Button(updst,text='Save',command=f12)   #command=f12
def f10():						#vist back Button
	updst.withdraw()
	root.deiconify()
btnUpdateBack=Button(updst,text='Back',command=f10)   #
btnUpdateSave.pack(pady=10)
btnUpdateBack.pack(pady=10)

def f11():
	root.withdraw()
	updst.deiconify()

updBtn=Button(root,text='Update',width=20,command=f11)
updBtn.pack(pady=10)

#------------------------delete---------------------------

delst=Toplevel(root)
delst.title('Delete Student')
delst.geometry('500x500+350+150')
delst.withdraw()

lblDeleteRno=Label(delst,text='Enter Roll No')
entDeleteteRno=Entry(delst,bd=5)

lblDeleteRno.pack(pady=10)
entDeleteteRno.pack(pady=10)

def f14():						#vist back Button
	delst.withdraw()
	root.deiconify()

def f15():
	try:
		stu_id_Del=int(entDeleteteRno.get())
		sql="delete from student where sid='%d'";
		args=(stu_id_Del)
		cursor.execute(sql%args)
		mydb.commit()
		msg=cursor.rowcount,' row deleted'
		messagebox.showwarning("Deleted",msg)
		entDeleteteRno.delete(0,END)
		entDeleteteRno.focus()
	except(ValueError,connector.DatabaseError,Exception)as e:
		msg=('please Enter Correct RollNo')
		messagebox.showerror("Error",msg)

btnDeleteSave=Button(delst,text='Delete',command=f15)
btnDeleteSave.pack(pady=10)
btnDeleteBack=Button(delst,text='Back',command=f14)
btnDeleteBack.pack(pady=10)

def f13():
	root.withdraw()
	delst.deiconify()

delBtn=Button(root,text='Delete',width=20,command=f13)
delBtn.pack(pady=10)

#--------------------------graph--------------------------

ViweGrphSt=Toplevel(root)
ViweGrphSt.title('Delete Student')
ViweGrphSt.geometry('1200x630+50+0')
ViweGrphSt.withdraw()

def f17():
	ViweGrphSt.withdraw()
	root.deiconify()

bckBtnVG=Button(ViweGrphSt,text='Bcak',command=f17)
bckBtnVG.pack(pady=10)

def f16():
	root.withdraw()
	from mysql import connector
	from matplotlib import pyplot as plt
	import numpy as np
	mydb=None
	try:
		mydb=connector.connect(host='localhost',user='root',passwd='abc123',database='py_conn2')
		#print('connected')
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

viewGrBtn=Button(root,text='View Graph',width=20,command=f16)
viewGrBtn.pack(pady=10)
exitButton1 =Button(root, text='Exit', width=20, command=root.destroy)
exitButton1.pack(pady=10)
root.mainloop()
