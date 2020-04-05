class Student:
	def __init__(win,name,roll,addr):
		win.name=''
		win.roll=0
		win.addr=''
	def showinfo(win):
		print('name:',win.name)
		print('roll no:',win.roll)
		print('address:',win.addr)
s1=Student('amit',10,'Mumbai')
s1.showinfo()