from tkinter import *
from tkinter import Button
from tkinter import LEFT
from tkinter import messagebox
root=Tk()
root.title("date and time")
root.geometry("500x500+500+300")
root.resizable(False,False)
def c1(num):
	try:
		if num==1:
			s1=entNumber1.get()
			num1=float(s1)
			s2=entNumber2.get()
			num2=float(s2)
			res=num1+num2
			messagebox.showinfo("Result of Addition",res)
			# entNumber1.delete(0,END)
			# entNumber1.focus()
			# entNumber2.delete(0,END)
			# entNumber2.focus()
		elif num==2:
			s1=entNumber1.get()
			num1=float(s1)
			s2=entNumber2.get()
			num2=float(s2)
			res=num1-num2
			messagebox.showinfo("Result of Substraction",res)
			# entNumber1.delete(0,END)
			# entNumber1.focus()
			# entNumber2.delete(0,END)
			# entNumber2.focus()
		elif num==3:
			s1=entNumber1.get()
			num1=float(s1)
			s2=entNumber2.get()
			num2=float(s2)
			res=num1*num2
			messagebox.showinfo("Result of Multiplication",res)
			# entNumber1.delete(0,END)
			# entNumber1.focus()
			# entNumber2.delete(0,END)
			# entNumber2.focus()
		else:
			try:
				s1=entNumber1.get()
				num1=float(s1)
				s2=entNumber2.get()
				num2=float(s2)
				res=num1/num2
				messagebox.showinfo("Result of Divide",res)
				# entNumber1.delete(0,END)
				# entNumber1.focus()
				# entNumber2.delete(0,END)
				# entNumber2.focus()
			except ZeroDivisionError:
				messagebox.showerror("Issue","Division by Zero Error ")
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
btnAdd=Button(root,text="Add",command=lambda:c1(1))
btnSub=Button(root,text="Substraction",command=lambda:c1(2))
btnMul=Button(root,text="Multiplication",command=lambda:c1(3))
btnDiv=Button(root,text="Divide",command=lambda:c1(4))
lblNumber1=Label(root,text='Enter First Number')
lblNumber1.place(x=5,y=10)
lblNumber2=Label(root,text='Enter Second Number')
lblNumber2.place(x=5,y=50)
entNumber1=Entry(root,bd=5)
entNumber2=Entry(root,bd=5)
entNumber1.place(x=150,y=10)
entNumber2.place(x=150,y=50)
btnAdd.pack(padx=20,side=LEFT)
btnSub.pack(padx=20,side=LEFT)
btnMul.pack(padx=20,side=LEFT)
btnDiv.pack(padx=20,side=LEFT)
root.mainloop()