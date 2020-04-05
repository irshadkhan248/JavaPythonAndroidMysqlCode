# #pp2  class circle
# data  radius
# method area(),circum() and default initilizer()
# radius from user and print area and circum 

import math
class Circle:
	def __init__(self):
		self.radius=0.0
	def area(self):
		ans=math.pi*math.pow(self.radius,2)
		print("area= ",ans)
	def circum(self):
		ans=2*math.pi*self.radius
		print("circumference = ",ans)
		
rad=float(input("enter radius "))
c=Circle()
c.radius=rad
c.area()
c.circum()
