#remove duplicate elememt from list

list1=[]
n=int(input("enter number of element"));
for i in range(n):
	d=input("""enter elememt """)
	list1.append(d)
list2=[]
for d in list1:
	if d not in list2:
		list2.append(d)
print(list1)
print(list2)