from tkinter import *
from tkinter import messagebox
root=Tk()
root.geometry("300x300+500+300")
root.title("Square Finder")
def sqr():
	try:
		s1=entNumber.get()
		num=float(s1)
		res=num*num
		messagebox.showinfo("Result",res)
		entNumber.delete(0,END)
		entNumber.focus()
	except ValueError:
		messagebox.showerror("Issue","Incorrect Number")
		entNumber.delete(0,END)
		entNumber.focus()
lblNumber=Label(root,text='Enter a Number')
lblNumber.place(x=10,y=10)
entNumber=Entry(root,bd=5)
entNumber.place(x=100,y=10)
btnSquare=Button(root,text="Square",command=sqr)
btnSquare.place(x=100,y=50)
root.mainloop()
			
	