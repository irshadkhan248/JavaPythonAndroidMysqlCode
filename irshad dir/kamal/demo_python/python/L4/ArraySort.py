import array
n=int(input("enter number of element :"))
num=array.array('i',[])
for i in range(n):
	ele=int(input("enter element :"))
	num.append(ele)
print(num)
for i in range(n):
	for j in range(i+1,n):
		if num[i]>num[j]:
			num[i],num[j]=num[j],num[i]
print(num)