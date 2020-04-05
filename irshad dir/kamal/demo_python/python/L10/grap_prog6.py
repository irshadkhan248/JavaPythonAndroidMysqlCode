from tkinter import *
from tkinter import messagebox

root=Tk()
root.geometry('300x300+250+250')
root.title('multipication')
def mul():
	try:
		s1=entNumber1.get()
		num1=float(s1)
		s2=entNumber2.get()
		num2=float(s2)
		res=num1*num2
		messagebox.showinfo("Result",res)
		entNumber1.delete(0,END)
		entNumber1.focus()
		entNumber2.delete(0,END)
		entNumber2.focus()
	except ValueError:
		messagebox.showerror("Issue","Incorrect Number")
		entNumber1.delete(0,END)
		entNumber1.focus()
		entNumber2.delete(0,END)
		entNumber2.focus()
lblNumber1=Label(root,text='Enter first Number')
lblNumber1.place(x=5,y=10)
lblNumber2=Label(root,text='Enter second Number')
lblNumber2.place(x=5,y=50)
entNumber1=Entry(root,bd=5)
entNumber2=Entry(root,bd=5)
entNumber1.place(x=150,y=10)
entNumber2.place(x=150,y=50)
btnMul=Button(root,text="Multiply",command=mul)
btnMul.place(x=100,y=100)
root.mainloop()
			