from tkinter import *
from tkinter import messagebox 
root=Tk()
root.title("Yoga Requirments")
root.geometry("400x200+500+200")
yoga=Label(root,text="Yoga!!",font=('ariel',18,'bold'))
yoga.grid(row=0,column=0,columnspan=3)
reason =BooleanVar()
reason.set(1)
looseWeight=Radiobutton(root,text='Loose weight',variable=reason,value=1,font=('ariel',14))
stamina=Radiobutton(root,text='Stamina Building',variable=reason,value=2,font=('ariel',14))
looseWeight.grid(row=1,column=0)
stamina.grid(row=1,column=1)
def f1():
	r=reason.get()
	if(r==1):
		messagebox.showinfo('Reason for Yoga','Loose weight')
	else:
		messagebox.showinfo('Reason for Yoga','Stamina Building')

submit=Button(root,text="Submit",command=f1)
submit.grid(row=2,column=0,columnspan=3)
root.mainloop()