class  Emp:
	def __init__(self,eid,pds):
		self.eid=eid
		self.pds=pds
	def __mul__(self,other):
		ans=self.pds * other.nopd
		return ans
class Attn:
	def __init__(self,nopd):
		self.nopd=nopd
e=Emp(100,100)
a=Attn(25)
sal=e*a
print(sal)