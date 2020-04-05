from tkinter import *
from tkinter import messagebox
root=Tk()
root.title("Material Recived")
root.geometry("400x300+300+230")
b1=IntVar()
b2=IntVar()
c1=IntVar()
cbBook1=Checkbutton(root,text="Book1",font=('comic',18,'bold'),variable=b1)
cbBook2=Checkbutton(root,text="Book2",font=('comic',18,'bold'),variable=b2)
cbCertificate=Checkbutton(root,text="Certificate",font=('comic',18,'bold'),variable=c1)




cbBook1.grid(sticky="w");
cbBook2.grid(sticky="w");
cbCertificate.grid(sticky="w");
def f1():
	
	msg=""
	if b1.get()==1:
		msg=msg+"book1 "
	if b2.get()==1:
		msg=msg+" book2"
	if c1.get()==1:
		msg=msg+" Certificate"
	messagebox.showinfo("Recived",msg)
	
	to="irshadkhan248@gmail.com"
	subject="Material received by irshad ahmed"
	text=msg
	import smtplib
	sender="talktoiak@gmail.com"
	password="99915123"
	message='Subject:{}\n\n{}'.format(subject,text)
	server=smtplib.SMTP_SSL('smtp.gmail.com',465)
	server.ehlo()
	server.login(sender,password)
	print('logged in')
	try:
		server.sendmail(sender,to,message)
		print('email sent')
	except:
		print('error sending email')
	server.quit
btnSubmit=Button(root, text="Submit",command=f1)
btnSubmit.grid()
root.mainloop()