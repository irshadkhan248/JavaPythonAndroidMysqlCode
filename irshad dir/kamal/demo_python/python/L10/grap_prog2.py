from tkinter import *
from tkinter import Button
from tkinter import LEFT
root=Tk()
root.title("date and time")
root.geometry("500x500+500+300")
root.resizable(False,False)
#root.configure(background='blue')
# root.iconbitmap("logo.ico")
btnDate=Button(root,text="Date")
btnTime=Button(root,text="Time")
btnDateTime=Button(root,text="Date and Time")
btnDate.pack(padx=20,side=LEFT)
btnTime.pack(padx=20,side=LEFT)
btnDateTime.pack(padx=20,side=LEFT)
root.mainloop()