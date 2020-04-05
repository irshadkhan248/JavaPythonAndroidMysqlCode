from tkinter import *
from tkinter import messagebox
win=Tk()
win.title("Feedback")
win.geometry("400x300+300+230")
f=IntVar()
f.set(2)
rbF=Radiobutton(win,text=" Fantastic ",variable=f,value=1)
rbE=Radiobutton(win,text=" Excelent ",variable=f,value=2)
rbG=Radiobutton(win,text=" Good ",variable=f,value=3)

rbF.grid(sticky="w");
rbE.grid(sticky="w");
rbG.grid(sticky="w");
def f1():
	r=f.get()
	msg=""
	if r==1:
		msg="fantastic"
	elif r==2:
		msg="excelent"
	else:
		msg="Good"
	messagebox.showinfo("Feedback",msg)

btnSubmit=Button(win, text="Submit",command=f1)
btnSubmit.grid()
win.mainloop()