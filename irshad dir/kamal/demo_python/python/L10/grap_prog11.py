from tkinter import *
from tkinter import messagebox
from tkinter import Button
root=Tk()
root.title("Carpenter Requirments")
root.geometry("400x200+500+200")
need=Label(root,text="Carpenter Needed for",font=('ariel black',18,'bold'))
need.grid(row=0,column=0,columnspan=3)
new_fur= BooleanVar()

newFurniture=Checkbutton(root,text='New Furniture',variable=new_fur,font=('ariel',18,'bold'))
rep_fur=BooleanVar()
repair_fur=Checkbutton(root,text='Repair Furniture',variable=rep_fur,font=('ariel',18,'bold'))
mod_fur=BooleanVar()
modify_fur=Checkbutton(root,text='Modify Furniture',variable=mod_fur,font=('ariel',18,'bold'))

newFurniture.grid(row=1,column=1,sticky=W)
repair_fur.grid(row=2,column=1,sticky=W)
modify_fur.grid(row=3,column=1,sticky=W)
def f1():
	msg=''
	if new_fur.get()==1:
		msg=msg+'New Furniture'+'\n'
	if rep_fur.get()==1:
		msg=msg+'Repair Furniture'+'\n'
	if mod_fur.get()==1:
		msg=msg+'Modify Furniture'+'\n'		
	messagebox.showinfo('Carpenter needed for',msg)
submit=Button(root,text='Submit',command=f1,font=('ariel',18,'bold'))
submit.grid(row=2,column=2,columnspan=3)
mainloop()