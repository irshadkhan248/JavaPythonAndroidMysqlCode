from tkinter import * 
#import Button

root=Tk()
root.title('Student Managment System')
root.geometry("500x450+300+290")
adBtn=Button(root,text='Add',width=20)
adBtn.pack(pady=10)
ViBtn=Button(root,text='View',width=20)
ViBtn.pack(pady=10)
updBtn=Button(root,text='Update',width=20)
updBtn.pack(pady=10)
deBtn=Button(root,text='Delete',width=20)
deBtn.pack(pady=10)
viGrBtn=Button(root,text='View Graph',width=20)
viGrBtn.pack(pady=10)

root.mainloop()