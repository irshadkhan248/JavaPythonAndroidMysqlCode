from tkinter import *
from tkinter import messagebox
from tkinter import scrolledtext
from mysql import connector
from PIL import Image, ImageTk
import socket
import requests
import bs4
import datetime
import time

root = Tk()
app = Toplevel(root)

#root.withdraw()
#time.sleep(2)
#root.deiconify()
root.title('Student Managment System')
root.geometry("500x450+300+290")


def f1():
	root.withdraw()
	adst.deiconify()
btnAdd=Button(root,text='Add',width=20,command=f1)
btnAdd.pack()
btnAdd.pack(pady=20)


adst=Toplevel(root)
adst.title('Add Student')
adst.geometry('500x500+350+150')
adst.withdraw()

lblAddRno=Label(adst,text='enter rno')
entAddRno=Entry(adst,bd=5)
lblAddName=Label(adst,text='enter name')
entAddName=Entry(adst,bd=6)

lblAddRno.pack(pady=10)
entAddRno.pack(pady=10)
lblAddName.pack(pady=10)
entAddName.pack(pady=10)


def f2():
	adst.withdraw()
	root.deiconify()

btnAddSave=Button(adst,text='Save')   #command=f5
btnAddBack=Button(adst,text='Back',command=f2)   #
btnAddSave.pack(pady=10)
btnAddBack.pack(pady=10)




updBtn=Button(root,text='Update',width=20)
updBtn.pack(pady=10)
deBtn=Button(root,text='Delete',width=20)
deBtn.pack(pady=10)
viGrBtn=Button(root,text='View Graph',width=20)
viGrBtn.pack(pady=10)
exitButton1 =Button(root, text='Exit', width=20, command=root.destroy)
exitButton1.place(relx=1.0, rely=1.0, anchor=SE)





app.title("Welcome!")
image2 =Image.open('image999.jpg')
image1 = ImageTk.PhotoImage(image2)
w = image1.width()
h = image1.height()
app.geometry("1200x630+50+0")

label1 = Label(app, image=image1,font=("Times New Roman", 24),justify=CENTER, height=400)
label1.pack()
res=requests.get("https://ipinfo.io/")
data=res.json()
city=data['city']
#print(city)
cityLabel=Label(app,text=city,font=("Times New Roman", 24))
cityLabel.place(x=155,y=438)
cL=Label(app,text='You are in',font=("Times New Roman", 24))
cL.place(x=10,y=438)

website="http://api.openweathermap.org/data/2.5/weather?units=metric"
loc="&q="+city
api_key="&appid=c6e315d09197cec231495138183954bd"
res1=requests.get(website+loc+api_key)
wdata=res1.json()
m=wdata['main']
t=m['temp']
#print('Temperature',t)
tempLabel=Label(app,text=t,font=("Times New Roman", 24))
tempLabel.place(x=185,y=470)
Tl=Label(app,text='Temperature:',font=("Times New Roman", 24))
Tl.place(x=10,y=470)
Tlabel=Label(app,text=datetime.datetime.now(),font=("Times New Roman", 24))
Tlabel.place(x=10,y=505)
d=datetime.datetime.now()
h=d.hour
msg=""
if h>=6 and h<12:
	msg="Good Morning !!!"
elif h>=12 and h<17 :
	msg='Good Afternoon'
else:
	msg='Good Evening '
mL=Label(app,text=msg,font=("Times New Roman", 24))
mL.place(x=10,y=405)
res=requests.get("https://www.brainyquote.com/quote_of_the_day.html")
print(res)
soup=bs4.BeautifulSoup(res.text,'lxml')
data=soup.find('img',{"class":"p-qotd"})
#print(data)
q=data['alt']
#print(q)
i_url=data['data-img-url']
#print(i_url)
soup=bs4.BeautifulSoup(res.text,'lxml')
data=soup.find('img',{"class":"p-qotd"})
#print(data)
q=data['alt']
#print(q)
i_url=data['data-img-url']
#print(i_url)

p_url='https://www.brainyquote.com'+i_url
res=requests.get(p_url)
with open("image999.jpg","wb") as f:
	f.write(res.content)
app.after(60000, app.destroy)
app.mainloop()