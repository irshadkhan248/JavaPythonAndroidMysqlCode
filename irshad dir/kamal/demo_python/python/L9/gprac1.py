from tkinter import *
from tkinter import messagebox
win =Tk()
win.title("enter a number")
win.geometry("400x300+350+250")
lblNumber=label(win,text="enter number ")
entNumber=Entry(win,bd=5)
def f1():
	s1=entNumber.get()
	n1=int(s1)
	msg=""
	if n1%2==0:
		msg="even"
	else:
		msg="odd"
	messagebox.showinfo("result",msg)
	
btnFind=Button(win,text="find",command=f1)
entNumber.focus()
lblNumber.pack()
entNumber.pack()
btnFind.pack()

win.mainloop()