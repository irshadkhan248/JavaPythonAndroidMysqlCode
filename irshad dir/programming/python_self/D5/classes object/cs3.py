class Student:
	def __init__(win):
		win.name=''
		win.roll=0
		win.addr=''
	def showinfo(win):
		print('name:',win.name)
		print('roll no:',win.roll)
		print('address:',win.addr)
s1=Student()
s1.name='amit'
s1.roll=10
s1.addr='Mumbai'
s1.showinfo()