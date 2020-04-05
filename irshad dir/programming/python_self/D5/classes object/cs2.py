class Person:
	def __init__(win):
		win.id=0
		win.name=''
		win.addr=''
	def showinfo(win):
		print('id:',win.id)
		print('name:',win.name)
		print('Address:',win.addr)
p1=Person()
p1.id=10
p1.name='amit'
p1.addr='Mumbai'
p1.showinfo()
print(end='\n')
p2=Person()
p2.id=20
p2.name='sumit'
p2.addr='Thane'
p2.showinfo()
