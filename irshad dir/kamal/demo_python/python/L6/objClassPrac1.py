# #"""waoop for class rectangle """
# IV length and width
# PI for length and width
# IM show area and perimeter
# do write test case also



class Rectangle:
	def __init__(self,l,w):
		self.length=1
		self.width=w
	
	def show(self):
		print("length",self.length,"width",self.width)
	def area(self):
		ans=self.length*self.width
		print("area = ",ans)
	def perimeter(self):
		ans=2*(self.length+self.width)
		print("perimeter ",ans)
l=float(input("enter length "))
w=float(input("enter width "))
r=Rectangle(l,w)
r.show()
r.area()
r.perimeter()
	
	