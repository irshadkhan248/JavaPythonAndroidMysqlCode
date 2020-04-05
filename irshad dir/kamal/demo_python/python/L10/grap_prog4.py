from tkinter import *
from tkinter import Button
from tkinter import LEFT
root=Tk()
root.title("date and time")
root.geometry("500x500+500+300")
root.resizable(False,False)
def c1(num):
	if num==1:
		import datetime
		from tkinter import messagebox
		d=datetime.datetime.now().date()
		messagebox.showinfo('date',d)

	elif num==2:
		from datetime import datetime
		from tkinter import messagebox
		t=datetime.now().time()
		messagebox.showwarning("time",t)

	else:
		import datetime
		from tkinter import messagebox
		dt=datetime.datetime.now()
		messagebox.showerror('date and time',dt)
		
btnDate=Button(root,text="Date",command=lambda:c1(1))
btnTime=Button(root,text="Time",command=lambda:c1(2))
btnDateTime=Button(root,text="Date and Time",command=lambda:c1(3))
btnDate.pack(padx=20,side=LEFT)
btnTime.pack(padx=20,side=LEFT)
btnDateTime.pack(padx=20,side=LEFT)
root.mainloop()