data=[]
elist=[]
olist=[]
n=int(input('Enter Number in List:'))
for i in range(n):
	num=int(input('Enter Element in List:'))
	data.append(num)
for j in data:
	if j%2==0:
		elist.append(j)
	else:
		olist.append(j)
print(olist)
print(elist)
olist.sort()
print(olist)
elist.sort(reverse=True)
print(elist)
