from tkinter import *
from tkinter import messagebox
from tkinter import Button
root=Tk()
root.title("Gender")
root.geometry("400x200+500+200")
Gender=Label(root,text="Gender!!",font=('ariel black',18,'bold'))
Gender.grid(row=0,column=0,columnspan=3)
gen=IntVar()
gen.set(1)
male=Radiobutton(root,text='Male',variable=gen,value=1,font=('ariel',18,'bold'))
female=Radiobutton(root,text='Female',variable=gen,value=2,font=('ariel',18,'bold'))
male.grid(row=1,column=1)
female.grid(row=1,column=3)
def f1():
	s=gen.get()
	if s==1:
		messagebox.showinfo('Submited Gender','you Submited Male')
	else:
		messagebox.showinfo('Submited Gender','You Submited Female')
submit=Button(root,text='Submit',command=f1,font=('ariel',18,'bold'))
submit.grid(row=2,column=2,columnspan=3)
mainloop()