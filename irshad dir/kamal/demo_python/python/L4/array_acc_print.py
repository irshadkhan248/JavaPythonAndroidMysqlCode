import array
n=int(input("enter number of element: "))
arr=array.array('i',[])
for i in range (n):
	ele=int(input("enter element: "))
	arr.append(ele)
print(arr)

for d in arr:
	print(d,end=" ")
print()

for i in range(len(arr)):
	print(arr[i],end=" ")
print()