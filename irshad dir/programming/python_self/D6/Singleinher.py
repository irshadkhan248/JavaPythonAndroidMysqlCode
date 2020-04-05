class Person:
	def __init__(self,id,name,addr):
		self.id=id
		self.name=name
		self.addr=addr
	def showinfo(self):
		print('id=',self.id)
		print('name=',self.name)
		print('addr=',self.addr)
class Student(Person):
	def __init__(self,id,name,addr,marks):
		super().__init__(id,name,addr)
		self.marks=marks
	def studentinfo(self):
		super().showinfo()
		print('Marks',self.marks)
s=Student(10,'irshad','mumbai',88)
s.studentinfo()