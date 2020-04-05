class Person:
	def __init__(win,id,name,addr):
		win.id=0
		win.name=''
		win.addr=''
	def showinfo(win):
		print('id:',win.id)
		print('name:',win.name)
		print('Address:',win.addr)
p1=Person(10,'amit','Mumbai')
p1.showinfo()