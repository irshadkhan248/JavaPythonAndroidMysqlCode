class Mech:
	def __init__(self,nop):
		self.nop=nop
	def __add__(self,other):
		a=self.nop+other.nop
		return a
	def __sub__(self,other):
		a=self.nop-other.nop
		return a
	def __mul__(self,other):
		a=self.nop * other.nop
		return a
class Bee:
	def __init__(self,nop):
		self.nop=nop
	def __sub__(self,other):
		a=self.nop+other.nop
		return a
	def __mul__(self,other):
		a=self.nop * other.nop
		return a
		
m=Mech(750)
b=Bee(300)
r1=m+b
r2=m-b
r3=m*b 
print(r1)
print(r2)
print(r3)     